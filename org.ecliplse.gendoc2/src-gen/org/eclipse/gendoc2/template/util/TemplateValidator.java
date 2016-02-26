/**
 */
package org.eclipse.gendoc2.template.util;

import java.util.Map;

import org.apache.poi.xwpf.usermodel.IBody;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import org.eclipse.acceleo.query.runtime.IQueryBuilderEngine.AstResult;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.gendoc2.parser.DocumentParsingError;
import org.eclipse.gendoc2.template.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gendoc2.template.TemplatePackage
 * @generated
 */
public class TemplateValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TemplateValidator INSTANCE = new TemplateValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.gendoc2.template";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TemplatePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TemplatePackage.ABSTRACT_CONSTRUCT:
				return validateAbstractConstruct((AbstractConstruct)value, diagnostics, context);
			case TemplatePackage.CONDITIONNAL:
				return validateConditionnal((Conditionnal)value, diagnostics, context);
			case TemplatePackage.REPETITION:
				return validateRepetition((Repetition)value, diagnostics, context);
			case TemplatePackage.QUERY:
				return validateQuery((Query)value, diagnostics, context);
			case TemplatePackage.TABLE:
				return validateTable((Table)value, diagnostics, context);
			case TemplatePackage.IMAGE:
				return validateImage((Image)value, diagnostics, context);
			case TemplatePackage.DEFAULT:
				return validateDefault((Default)value, diagnostics, context);
			case TemplatePackage.COMPOUND:
				return validateCompound((Compound)value, diagnostics, context);
			case TemplatePackage.TEMPLATE:
				return validateTemplate((Template)value, diagnostics, context);
			case TemplatePackage.REPRESENTATION:
				return validateRepresentation((Representation)value, diagnostics, context);
			case TemplatePackage.STATIC_FRAGMENT:
				return validateStaticFragment((StaticFragment)value, diagnostics, context);
			case TemplatePackage.VAR_REF:
				return validateVarRef((VarRef)value, diagnostics, context);
			case TemplatePackage.QUERY_BEHAVIOR:
				return validateQueryBehavior((QueryBehavior)value, diagnostics, context);
			case TemplatePackage.BODY:
				return validateBody((IBody)value, diagnostics, context);
			case TemplatePackage.PARAGRAPH:
				return validateParagraph((XWPFParagraph)value, diagnostics, context);
			case TemplatePackage.RUN:
				return validateRun((XWPFRun)value, diagnostics, context);
			case TemplatePackage.AST_RESULT:
				return validateAstResult((AstResult)value, diagnostics, context);
			case TemplatePackage.DOCUMENT_PARSING_ERROR:
				return validateDocumentParsingError((DocumentParsingError)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractConstruct(AbstractConstruct abstractConstruct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractConstruct, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionnal(Conditionnal conditionnal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conditionnal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(conditionnal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conditionnal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conditionnal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(conditionnal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conditionnal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(conditionnal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(conditionnal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conditionnal, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionnal_AlternativeExcludeElse(conditionnal, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AlternativeExcludeElse constraint of '<em>Conditionnal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionnal_AlternativeExcludeElse(Conditionnal conditionnal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AlternativeExcludeElse", getObjectLabel(conditionnal, context) },
						 new Object[] { conditionnal },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepetition(Repetition repetition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repetition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuery(Query query, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(query, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(table, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImage(Image image, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(image, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefault(Default default_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(default_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompound(Compound compound, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compound, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplate(Template template, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(template, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepresentation(Representation representation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(representation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticFragment(StaticFragment staticFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticFragment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVarRef(VarRef varRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(varRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryBehavior(QueryBehavior queryBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBody(IBody body, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParagraph(XWPFParagraph paragraph, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRun(XWPFRun run, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAstResult(AstResult astResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentParsingError(DocumentParsingError documentParsingError, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TemplateValidator
