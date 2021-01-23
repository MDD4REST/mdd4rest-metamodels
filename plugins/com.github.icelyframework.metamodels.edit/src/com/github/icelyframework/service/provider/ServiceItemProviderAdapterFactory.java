/**
 */
package com.github.icelyframework.service.provider;

import com.github.icelyframework.service.util.ServiceAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceItemProviderAdapterFactory extends ServiceAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Project} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectItemProvider projectItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjectAdapter() {
		if (projectItemProvider == null) {
			projectItemProvider = new ProjectItemProvider(this);
		}

		return projectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Application} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationItemProvider applicationItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationAdapter() {
		if (applicationItemProvider == null) {
			applicationItemProvider = new ApplicationItemProvider(this);
		}

		return applicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.PrimitiveType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeItemProvider primitiveTypeItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrimitiveTypeAdapter() {
		if (primitiveTypeItemProvider == null) {
			primitiveTypeItemProvider = new PrimitiveTypeItemProvider(this);
		}

		return primitiveTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Relation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationItemProvider relationItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationAdapter() {
		if (relationItemProvider == null) {
			relationItemProvider = new RelationItemProvider(this);
		}

		return relationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Literal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralItemProvider literalItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Literal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLiteralAdapter() {
		if (literalItemProvider == null) {
			literalItemProvider = new LiteralItemProvider(this);
		}

		return literalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Inheritance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InheritanceItemProvider inheritanceItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Inheritance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInheritanceAdapter() {
		if (inheritanceItemProvider == null) {
			inheritanceItemProvider = new InheritanceItemProvider(this);
		}

		return inheritanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Entity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityItemProvider entityItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntityAdapter() {
		if (entityItemProvider == null) {
			entityItemProvider = new EntityItemProvider(this);
		}

		return entityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.ValueObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueObjectItemProvider valueObjectItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.ValueObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueObjectAdapter() {
		if (valueObjectItemProvider == null) {
			valueObjectItemProvider = new ValueObjectItemProvider(this);
		}

		return valueObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.DataMapper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataMapperItemProvider dataMapperItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.DataMapper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataMapperAdapter() {
		if (dataMapperItemProvider == null) {
			dataMapperItemProvider = new DataMapperItemProvider(this);
		}

		return dataMapperItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.BasicType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicTypeItemProvider basicTypeItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.BasicType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBasicTypeAdapter() {
		if (basicTypeItemProvider == null) {
			basicTypeItemProvider = new BasicTypeItemProvider(this);
		}

		return basicTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.CommandEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandEventItemProvider commandEventItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.CommandEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandEventAdapter() {
		if (commandEventItemProvider == null) {
			commandEventItemProvider = new CommandEventItemProvider(this);
		}

		return commandEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Enumeration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationItemProvider enumerationItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationAdapter() {
		if (enumerationItemProvider == null) {
			enumerationItemProvider = new EnumerationItemProvider(this);
		}

		return enumerationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Aggregate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateItemProvider aggregateItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Aggregate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAggregateAdapter() {
		if (aggregateItemProvider == null) {
			aggregateItemProvider = new AggregateItemProvider(this);
		}

		return aggregateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.DTO} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTOItemProvider dtoItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.DTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDTOAdapter() {
		if (dtoItemProvider == null) {
			dtoItemProvider = new DTOItemProvider(this);
		}

		return dtoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.DomainEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainEventItemProvider domainEventItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.DomainEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainEventAdapter() {
		if (domainEventItemProvider == null) {
			domainEventItemProvider = new DomainEventItemProvider(this);
		}

		return domainEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Path} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathItemProvider pathItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Path}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPathAdapter() {
		if (pathItemProvider == null) {
			pathItemProvider = new PathItemProvider(this);
		}

		return pathItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Repository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryItemProvider repositoryItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepositoryAdapter() {
		if (repositoryItemProvider == null) {
			repositoryItemProvider = new RepositoryItemProvider(this);
		}

		return repositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.ResourceOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceOperationItemProvider resourceOperationItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.ResourceOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceOperationAdapter() {
		if (resourceOperationItemProvider == null) {
			resourceOperationItemProvider = new ResourceOperationItemProvider(this);
		}

		return resourceOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Resource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceItemProvider resourceItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceAdapter() {
		if (resourceItemProvider == null) {
			resourceItemProvider = new ResourceItemProvider(this);
		}

		return resourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.ServiceOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceOperationItemProvider serviceOperationItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.ServiceOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceOperationAdapter() {
		if (serviceOperationItemProvider == null) {
			serviceOperationItemProvider = new ServiceOperationItemProvider(this);
		}

		return serviceOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.RepositoryOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryOperationItemProvider repositoryOperationItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.RepositoryOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepositoryOperationAdapter() {
		if (repositoryOperationItemProvider == null) {
			repositoryOperationItemProvider = new RepositoryOperationItemProvider(this);
		}

		return repositoryOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.DomainObjectOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainObjectOperationItemProvider domainObjectOperationItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.DomainObjectOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainObjectOperationAdapter() {
		if (domainObjectOperationItemProvider == null) {
			domainObjectOperationItemProvider = new DomainObjectOperationItemProvider(this);
		}

		return domainObjectOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Consumer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsumerItemProvider consumerItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Consumer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConsumerAdapter() {
		if (consumerItemProvider == null) {
			consumerItemProvider = new ConsumerItemProvider(this);
		}

		return consumerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Subscribe} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscribeItemProvider subscribeItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Subscribe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubscribeAdapter() {
		if (subscribeItemProvider == null) {
			subscribeItemProvider = new SubscribeItemProvider(this);
		}

		return subscribeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Service} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceItemProvider serviceItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceAdapter() {
		if (serviceItemProvider == null) {
			serviceItemProvider = new ServiceItemProvider(this);
		}

		return serviceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Operation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationItemProvider operationItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationAdapter() {
		if (operationItemProvider == null) {
			operationItemProvider = new OperationItemProvider(this);
		}

		return operationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Publish} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublishItemProvider publishItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Publish}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPublishAdapter() {
		if (publishItemProvider == null) {
			publishItemProvider = new PublishItemProvider(this);
		}

		return publishItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.ComplexType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexTypeItemProvider complexTypeItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.ComplexType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComplexTypeAdapter() {
		if (complexTypeItemProvider == null) {
			complexTypeItemProvider = new ComplexTypeItemProvider(this);
		}

		return complexTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Module} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleItemProvider moduleItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModuleAdapter() {
		if (moduleItemProvider == null) {
			moduleItemProvider = new ModuleItemProvider(this);
		}

		return moduleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.HasAnyAuthorities} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HasAnyAuthoritiesItemProvider hasAnyAuthoritiesItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.HasAnyAuthorities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHasAnyAuthoritiesAdapter() {
		if (hasAnyAuthoritiesItemProvider == null) {
			hasAnyAuthoritiesItemProvider = new HasAnyAuthoritiesItemProvider(this);
		}

		return hasAnyAuthoritiesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.HasAuthority} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HasAuthorityItemProvider hasAuthorityItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.HasAuthority}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHasAuthorityAdapter() {
		if (hasAuthorityItemProvider == null) {
			hasAuthorityItemProvider = new HasAuthorityItemProvider(this);
		}

		return hasAuthorityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Authenticated} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticatedItemProvider authenticatedItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Authenticated}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAuthenticatedAdapter() {
		if (authenticatedItemProvider == null) {
			authenticatedItemProvider = new AuthenticatedItemProvider(this);
		}

		return authenticatedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Access} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessItemProvider accessItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Access}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAccessAdapter() {
		if (accessItemProvider == null) {
			accessItemProvider = new AccessItemProvider(this);
		}

		return accessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.PermitAll} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermitAllItemProvider permitAllItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.PermitAll}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPermitAllAdapter() {
		if (permitAllItemProvider == null) {
			permitAllItemProvider = new PermitAllItemProvider(this);
		}

		return permitAllItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.Role} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleItemProvider roleItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleAdapter() {
		if (roleItemProvider == null) {
			roleItemProvider = new RoleItemProvider(this);
		}

		return roleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.ResourceParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceParamItemProvider resourceParamItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.ResourceParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceParamAdapter() {
		if (resourceParamItemProvider == null) {
			resourceParamItemProvider = new ResourceParamItemProvider(this);
		}

		return resourceParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.OutputRepresentation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputRepresentationItemProvider outputRepresentationItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.OutputRepresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputRepresentationAdapter() {
		if (outputRepresentationItemProvider == null) {
			outputRepresentationItemProvider = new OutputRepresentationItemProvider(this);
		}

		return outputRepresentationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.service.InputRepresentation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputRepresentationItemProvider inputRepresentationItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.service.InputRepresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputRepresentationAdapter() {
		if (inputRepresentationItemProvider == null) {
			inputRepresentationItemProvider = new InputRepresentationItemProvider(this);
		}

		return inputRepresentationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (projectItemProvider != null) projectItemProvider.dispose();
		if (applicationItemProvider != null) applicationItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (primitiveTypeItemProvider != null) primitiveTypeItemProvider.dispose();
		if (relationItemProvider != null) relationItemProvider.dispose();
		if (literalItemProvider != null) literalItemProvider.dispose();
		if (inheritanceItemProvider != null) inheritanceItemProvider.dispose();
		if (entityItemProvider != null) entityItemProvider.dispose();
		if (valueObjectItemProvider != null) valueObjectItemProvider.dispose();
		if (dataMapperItemProvider != null) dataMapperItemProvider.dispose();
		if (basicTypeItemProvider != null) basicTypeItemProvider.dispose();
		if (commandEventItemProvider != null) commandEventItemProvider.dispose();
		if (enumerationItemProvider != null) enumerationItemProvider.dispose();
		if (aggregateItemProvider != null) aggregateItemProvider.dispose();
		if (dtoItemProvider != null) dtoItemProvider.dispose();
		if (domainEventItemProvider != null) domainEventItemProvider.dispose();
		if (pathItemProvider != null) pathItemProvider.dispose();
		if (repositoryItemProvider != null) repositoryItemProvider.dispose();
		if (resourceOperationItemProvider != null) resourceOperationItemProvider.dispose();
		if (resourceItemProvider != null) resourceItemProvider.dispose();
		if (serviceOperationItemProvider != null) serviceOperationItemProvider.dispose();
		if (repositoryOperationItemProvider != null) repositoryOperationItemProvider.dispose();
		if (domainObjectOperationItemProvider != null) domainObjectOperationItemProvider.dispose();
		if (consumerItemProvider != null) consumerItemProvider.dispose();
		if (subscribeItemProvider != null) subscribeItemProvider.dispose();
		if (serviceItemProvider != null) serviceItemProvider.dispose();
		if (operationItemProvider != null) operationItemProvider.dispose();
		if (publishItemProvider != null) publishItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (complexTypeItemProvider != null) complexTypeItemProvider.dispose();
		if (moduleItemProvider != null) moduleItemProvider.dispose();
		if (hasAnyAuthoritiesItemProvider != null) hasAnyAuthoritiesItemProvider.dispose();
		if (hasAuthorityItemProvider != null) hasAuthorityItemProvider.dispose();
		if (authenticatedItemProvider != null) authenticatedItemProvider.dispose();
		if (accessItemProvider != null) accessItemProvider.dispose();
		if (permitAllItemProvider != null) permitAllItemProvider.dispose();
		if (roleItemProvider != null) roleItemProvider.dispose();
		if (resourceParamItemProvider != null) resourceParamItemProvider.dispose();
		if (outputRepresentationItemProvider != null) outputRepresentationItemProvider.dispose();
		if (inputRepresentationItemProvider != null) inputRepresentationItemProvider.dispose();
	}

}