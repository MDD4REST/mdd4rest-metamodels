/**
 */
package org.sculptor.sculptormetamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sculptor.sculptormetamodel.Application;
import org.sculptor.sculptormetamodel.Attribute;
import org.sculptor.sculptormetamodel.BasicType;
import org.sculptor.sculptormetamodel.CommandEvent;
import org.sculptor.sculptormetamodel.Consumer;
import org.sculptor.sculptormetamodel.DataTransferObject;
import org.sculptor.sculptormetamodel.DiscriminatorType;
import org.sculptor.sculptormetamodel.DomainEvent;
import org.sculptor.sculptormetamodel.DomainObjectOperation;
import org.sculptor.sculptormetamodel.DomainObjectTypedElement;
import org.sculptor.sculptormetamodel.Entity;
import org.sculptor.sculptormetamodel.EnumConstructorParameter;
import org.sculptor.sculptormetamodel.EnumValue;
import org.sculptor.sculptormetamodel.HttpMethod;
import org.sculptor.sculptormetamodel.Inheritance;
import org.sculptor.sculptormetamodel.InheritanceType;
import org.sculptor.sculptormetamodel.Operation;
import org.sculptor.sculptormetamodel.Parameter;
import org.sculptor.sculptormetamodel.Project;
import org.sculptor.sculptormetamodel.Publish;
import org.sculptor.sculptormetamodel.Reference;
import org.sculptor.sculptormetamodel.Repository;
import org.sculptor.sculptormetamodel.RepositoryOperation;
import org.sculptor.sculptormetamodel.Resource;
import org.sculptor.sculptormetamodel.ResourceOperation;
import org.sculptor.sculptormetamodel.SculptormetamodelFactory;
import org.sculptor.sculptormetamodel.SculptormetamodelPackage;
import org.sculptor.sculptormetamodel.Service;
import org.sculptor.sculptormetamodel.ServiceOperation;
import org.sculptor.sculptormetamodel.Subscribe;
import org.sculptor.sculptormetamodel.Trait;
import org.sculptor.sculptormetamodel.TypedElement;
import org.sculptor.sculptormetamodel.ValueObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SculptormetamodelFactoryImpl extends EFactoryImpl implements SculptormetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SculptormetamodelFactory init() {
		try {
			SculptormetamodelFactory theSculptormetamodelFactory = (SculptormetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(SculptormetamodelPackage.eNS_URI);
			if (theSculptormetamodelFactory != null) {
				return theSculptormetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SculptormetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SculptormetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SculptormetamodelPackage.PROJECT: return createProject();
			case SculptormetamodelPackage.APPLICATION: return createApplication();
			case SculptormetamodelPackage.MODULE: return createModule();
			case SculptormetamodelPackage.DOMAIN_OBJECT_OPERATION: return createDomainObjectOperation();
			case SculptormetamodelPackage.SERVICE: return createService();
			case SculptormetamodelPackage.SERVICE_OPERATION: return createServiceOperation();
			case SculptormetamodelPackage.REPOSITORY: return createRepository();
			case SculptormetamodelPackage.REPOSITORY_OPERATION: return createRepositoryOperation();
			case SculptormetamodelPackage.REFERENCE: return createReference();
			case SculptormetamodelPackage.TYPED_ELEMENT: return createTypedElement();
			case SculptormetamodelPackage.ATTRIBUTE: return createAttribute();
			case SculptormetamodelPackage.DOMAIN_OBJECT_TYPED_ELEMENT: return createDomainObjectTypedElement();
			case SculptormetamodelPackage.OPERATION: return createOperation();
			case SculptormetamodelPackage.PARAMETER: return createParameter();
			case SculptormetamodelPackage.ENTITY: return createEntity();
			case SculptormetamodelPackage.VALUE_OBJECT: return createValueObject();
			case SculptormetamodelPackage.BASIC_TYPE: return createBasicType();
			case SculptormetamodelPackage.ENUM: return createEnum();
			case SculptormetamodelPackage.ENUM_VALUE: return createEnumValue();
			case SculptormetamodelPackage.ENUM_CONSTRUCTOR_PARAMETER: return createEnumConstructorParameter();
			case SculptormetamodelPackage.INHERITANCE: return createInheritance();
			case SculptormetamodelPackage.DATA_TRANSFER_OBJECT: return createDataTransferObject();
			case SculptormetamodelPackage.TRAIT: return createTrait();
			case SculptormetamodelPackage.COMMAND_EVENT: return createCommandEvent();
			case SculptormetamodelPackage.DOMAIN_EVENT: return createDomainEvent();
			case SculptormetamodelPackage.CONSUMER: return createConsumer();
			case SculptormetamodelPackage.PUBLISH: return createPublish();
			case SculptormetamodelPackage.SUBSCRIBE: return createSubscribe();
			case SculptormetamodelPackage.RESOURCE: return createResource();
			case SculptormetamodelPackage.RESOURCE_OPERATION: return createResourceOperation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SculptormetamodelPackage.INHERITANCE_TYPE:
				return createInheritanceTypeFromString(eDataType, initialValue);
			case SculptormetamodelPackage.DISCRIMINATOR_TYPE:
				return createDiscriminatorTypeFromString(eDataType, initialValue);
			case SculptormetamodelPackage.HTTP_METHOD:
				return createHttpMethodFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SculptormetamodelPackage.INHERITANCE_TYPE:
				return convertInheritanceTypeToString(eDataType, instanceValue);
			case SculptormetamodelPackage.DISCRIMINATOR_TYPE:
				return convertDiscriminatorTypeToString(eDataType, instanceValue);
			case SculptormetamodelPackage.HTTP_METHOD:
				return convertHttpMethodToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.sculptor.sculptormetamodel.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainObjectOperation createDomainObjectOperation() {
		DomainObjectOperationImpl domainObjectOperation = new DomainObjectOperationImpl();
		return domainObjectOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceOperation createServiceOperation() {
		ServiceOperationImpl serviceOperation = new ServiceOperationImpl();
		return serviceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepositoryOperation createRepositoryOperation() {
		RepositoryOperationImpl repositoryOperation = new RepositoryOperationImpl();
		return repositoryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypedElement createTypedElement() {
		TypedElementImpl typedElement = new TypedElementImpl();
		return typedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainObjectTypedElement createDomainObjectTypedElement() {
		DomainObjectTypedElementImpl domainObjectTypedElement = new DomainObjectTypedElementImpl();
		return domainObjectTypedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueObject createValueObject() {
		ValueObjectImpl valueObject = new ValueObjectImpl();
		return valueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicType createBasicType() {
		BasicTypeImpl basicType = new BasicTypeImpl();
		return basicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.sculptor.sculptormetamodel.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumValue createEnumValue() {
		EnumValueImpl enumValue = new EnumValueImpl();
		return enumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumConstructorParameter createEnumConstructorParameter() {
		EnumConstructorParameterImpl enumConstructorParameter = new EnumConstructorParameterImpl();
		return enumConstructorParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inheritance createInheritance() {
		InheritanceImpl inheritance = new InheritanceImpl();
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTransferObject createDataTransferObject() {
		DataTransferObjectImpl dataTransferObject = new DataTransferObjectImpl();
		return dataTransferObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trait createTrait() {
		TraitImpl trait = new TraitImpl();
		return trait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandEvent createCommandEvent() {
		CommandEventImpl commandEvent = new CommandEventImpl();
		return commandEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainEvent createDomainEvent() {
		DomainEventImpl domainEvent = new DomainEventImpl();
		return domainEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Consumer createConsumer() {
		ConsumerImpl consumer = new ConsumerImpl();
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Publish createPublish() {
		PublishImpl publish = new PublishImpl();
		return publish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subscribe createSubscribe() {
		SubscribeImpl subscribe = new SubscribeImpl();
		return subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceOperation createResourceOperation() {
		ResourceOperationImpl resourceOperation = new ResourceOperationImpl();
		return resourceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceType createInheritanceTypeFromString(EDataType eDataType, String initialValue) {
		InheritanceType result = InheritanceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInheritanceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscriminatorType createDiscriminatorTypeFromString(EDataType eDataType, String initialValue) {
		DiscriminatorType result = DiscriminatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiscriminatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethod createHttpMethodFromString(EDataType eDataType, String initialValue) {
		HttpMethod result = HttpMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SculptormetamodelPackage getSculptormetamodelPackage() {
		return (SculptormetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SculptormetamodelPackage getPackage() {
		return SculptormetamodelPackage.eINSTANCE;
	}

} //SculptormetamodelFactoryImpl
