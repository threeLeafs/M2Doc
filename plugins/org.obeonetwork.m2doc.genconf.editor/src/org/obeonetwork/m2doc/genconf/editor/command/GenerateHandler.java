/*******************************************************************************
 *  Copyright (c) 2016 Obeo. 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *       Obeo - initial API and implementation
 *  
 *******************************************************************************/
package org.obeonetwork.m2doc.genconf.editor.command;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.IProgressService;
import org.obeonetwork.m2doc.genconf.GenconfUtils;
import org.obeonetwork.m2doc.genconf.Generation;
import org.obeonetwork.m2doc.genconf.presentation.M2docconfEditorPlugin;
import org.obeonetwork.m2doc.generator.DocumentGenerationException;
import org.obeonetwork.m2doc.ide.M2DocPlugin;
import org.obeonetwork.m2doc.parser.DocumentParserException;

/**
 * Generate docx from docx template.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 */
public class GenerateHandler extends AbstractGenerationHandler {

    @Override
    protected void execute(ExecutionEvent event, final Generation generation) {
        final Shell shell = HandlerUtil.getActiveShell(event);
        final List<URI> generatedfiles = new ArrayList<URI>();
        IWorkbench wb = PlatformUI.getWorkbench();
        IProgressService ps = wb.getProgressService();
        try {
            ps.busyCursorWhile(new IRunnableWithProgress() {
                @Override
                public void run(IProgressMonitor pm) throws InvocationTargetException {
                    try {
                        generatedfiles.addAll(GenconfUtils.generate(generation, M2DocPlugin.getClassProvider(),
                                BasicMonitor.toMonitor(pm)));

                    } catch (IOException e) {
                        throw new InvocationTargetException(e);
                    } catch (DocumentParserException e) {
                        throw new InvocationTargetException(e);
                    } catch (DocumentGenerationException e) {
                        throw new InvocationTargetException(e);
                        // CHECKSTYLE:OFF any error should be reported back.
                    } catch (RuntimeException e) {// do not let exception leak out.
                        // CHECKSTYLE:ON
                        throw new InvocationTargetException(e);
                    }
                }
            });
            if (generatedfiles.size() == 1) {
                MessageDialog.openInformation(shell, "M2Doc generation",
                        "The document '" + generatedfiles.get(0) + "' is generated.");
            } else if (generatedfiles.size() == 2) {
                MessageDialog.openInformation(shell, "M2Doc generation",
                        "The document '" + generatedfiles.get(0).toString()
                            + "' is generated. \n\n The template file contains validation errors, please read '"
                            + generatedfiles.get(1) + "'.");
            }
        } catch (InvocationTargetException | InterruptedException e) {
            String msg = e.getMessage();
            M2docconfEditorPlugin.getPlugin().getLog()
                    .log(new Status(Status.ERROR, M2docconfEditorPlugin.getPlugin().getSymbolicName(), Status.ERROR,
                            "M2Doc : technical error" + (msg == null ? "." : " : " + msg), e));
            MessageDialog.openError(shell, "Generation problem. See the error log for details", e.getMessage());
        }
    }

}
