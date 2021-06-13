/**
 */
package openapi2.provider;

import java.util.ArrayList;
import java.util.Collection;

import openapi2.util.Openapi2AdapterFactory;

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
public class Openapi2ItemProviderAdapterFactory extends Openapi2AdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public Openapi2ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link openapi2.ContainedCollections} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainedCollectionsItemProvider containedCollectionsItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.ContainedCollections}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainedCollectionsAdapter() {
		if (containedCollectionsItemProvider == null) {
			containedCollectionsItemProvider = new ContainedCollectionsItemProvider(this);
		}

		return containedCollectionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link openapi2.API} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIItemProvider apiItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.API}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAPIAdapter() {
		if (apiItemProvider == null) {
			apiItemProvider = new APIItemProvider(this);
		}

		return apiItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link openapi2.Info} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfoItemProvider infoItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.Info}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInfoAdapter() {
		if (infoItemProvider == null) {
			infoItemProvider = new InfoItemProvider(this);
		}

		return infoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link openapi2.Contact} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactItemProvider contactItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.Contact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContactAdapter() {
		if (contactItemProvider == null) {
			contactItemProvider = new ContactItemProvider(this);
		}

		return contactItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link openapi2.License} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LicenseItemProvider licenseItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.License}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLicenseAdapter() {
		if (licenseItemProvider == null) {
			licenseItemProvider = new LicenseItemProvider(this);
		}

		return licenseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link openapi2.Path} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathItemProvider pathItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.Path}.
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
	 * This keeps track of the one adapter used for all {@link openapi2.Operation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationItemProvider operationItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.Operation}.
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
	 * This keeps track of the one adapter used for all {@link openapi2.ExternalDocs} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalDocsItemProvider externalDocsItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.ExternalDocs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalDocsAdapter() {
		if (externalDocsItemProvider == null) {
			externalDocsItemProvider = new ExternalDocsItemProvider(this);
		}

		return externalDocsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link openapi2.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.Parameter}.
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
	 * This keeps track of the one adapter used for all {@link openapi2.ItemsDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemsDefinitionItemProvider itemsDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.ItemsDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createItemsDefinitionAdapter() {
		if (itemsDefinitionItemProvider == null) {
			itemsDefinitionItemProvider = new ItemsDefinitionItemProvider(this);
		}

		return itemsDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link openapi2.Schema} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaItemProvider schemaItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.Schema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchemaAdapter() {
		if (schemaItemProvider == null) {
			schemaItemProvider = new SchemaItemProvider(this);
		}

		return schemaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link openapi2.Response} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseItemProvider responseItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.Response}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResponseAdapter() {
		if (responseItemProvider == null) {
			responseItemProvider = new ResponseItemProvider(this);
		}

		return responseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link openapi2.Header} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderItemProvider headerItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.Header}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHeaderAdapter() {
		if (headerItemProvider == null) {
			headerItemProvider = new HeaderItemProvider(this);
		}

		return headerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link openapi2.Tag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagItemProvider tagItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTagAdapter() {
		if (tagItemProvider == null) {
			tagItemProvider = new TagItemProvider(this);
		}

		return tagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link openapi2.SecurityScheme} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecuritySchemeItemProvider securitySchemeItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.SecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecuritySchemeAdapter() {
		if (securitySchemeItemProvider == null) {
			securitySchemeItemProvider = new SecuritySchemeItemProvider(this);
		}

		return securitySchemeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link openapi2.Example} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleItemProvider exampleItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.Example}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExampleAdapter() {
		if (exampleItemProvider == null) {
			exampleItemProvider = new ExampleItemProvider(this);
		}

		return exampleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link openapi2.XMLElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLElementItemProvider xmlElementItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.XMLElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXMLElementAdapter() {
		if (xmlElementItemProvider == null) {
			xmlElementItemProvider = new XMLElementItemProvider(this);
		}

		return xmlElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link openapi2.SecurityScope} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityScopeItemProvider securityScopeItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.SecurityScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecurityScopeAdapter() {
		if (securityScopeItemProvider == null) {
			securityScopeItemProvider = new SecurityScopeItemProvider(this);
		}

		return securityScopeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link openapi2.SecurityRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityRequirementItemProvider securityRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.SecurityRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecurityRequirementAdapter() {
		if (securityRequirementItemProvider == null) {
			securityRequirementItemProvider = new SecurityRequirementItemProvider(this);
		}

		return securityRequirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link openapi2.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.Property}.
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
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseEntryItemProvider responseEntryItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResponseEntryAdapter() {
		if (responseEntryItemProvider == null) {
			responseEntryItemProvider = new ResponseEntryItemProvider(this);
		}

		return responseEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaEntryItemProvider schemaEntryItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchemaEntryAdapter() {
		if (schemaEntryItemProvider == null) {
			schemaEntryItemProvider = new SchemaEntryItemProvider(this);
		}

		return schemaEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseDefinitionEntryItemProvider responseDefinitionEntryItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResponseDefinitionEntryAdapter() {
		if (responseDefinitionEntryItemProvider == null) {
			responseDefinitionEntryItemProvider = new ResponseDefinitionEntryItemProvider(this);
		}

		return responseDefinitionEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterEntryItemProvider parameterEntryItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterEntryAdapter() {
		if (parameterEntryItemProvider == null) {
			parameterEntryItemProvider = new ParameterEntryItemProvider(this);
		}

		return parameterEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecuritySchemeEntryItemProvider securitySchemeEntryItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecuritySchemeEntryAdapter() {
		if (securitySchemeEntryItemProvider == null) {
			securitySchemeEntryItemProvider = new SecuritySchemeEntryItemProvider(this);
		}

		return securitySchemeEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link openapi2.RequiredSecurityScheme} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredSecuritySchemeItemProvider requiredSecuritySchemeItemProvider;

	/**
	 * This creates an adapter for a {@link openapi2.RequiredSecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequiredSecuritySchemeAdapter() {
		if (requiredSecuritySchemeItemProvider == null) {
			requiredSecuritySchemeItemProvider = new RequiredSecuritySchemeItemProvider(this);
		}

		return requiredSecuritySchemeItemProvider;
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
		if (containedCollectionsItemProvider != null) containedCollectionsItemProvider.dispose();
		if (apiItemProvider != null) apiItemProvider.dispose();
		if (infoItemProvider != null) infoItemProvider.dispose();
		if (contactItemProvider != null) contactItemProvider.dispose();
		if (licenseItemProvider != null) licenseItemProvider.dispose();
		if (pathItemProvider != null) pathItemProvider.dispose();
		if (operationItemProvider != null) operationItemProvider.dispose();
		if (externalDocsItemProvider != null) externalDocsItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (itemsDefinitionItemProvider != null) itemsDefinitionItemProvider.dispose();
		if (schemaItemProvider != null) schemaItemProvider.dispose();
		if (responseItemProvider != null) responseItemProvider.dispose();
		if (headerItemProvider != null) headerItemProvider.dispose();
		if (tagItemProvider != null) tagItemProvider.dispose();
		if (securitySchemeItemProvider != null) securitySchemeItemProvider.dispose();
		if (exampleItemProvider != null) exampleItemProvider.dispose();
		if (xmlElementItemProvider != null) xmlElementItemProvider.dispose();
		if (securityScopeItemProvider != null) securityScopeItemProvider.dispose();
		if (securityRequirementItemProvider != null) securityRequirementItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (responseEntryItemProvider != null) responseEntryItemProvider.dispose();
		if (schemaEntryItemProvider != null) schemaEntryItemProvider.dispose();
		if (responseDefinitionEntryItemProvider != null) responseDefinitionEntryItemProvider.dispose();
		if (parameterEntryItemProvider != null) parameterEntryItemProvider.dispose();
		if (securitySchemeEntryItemProvider != null) securitySchemeEntryItemProvider.dispose();
		if (requiredSecuritySchemeItemProvider != null) requiredSecuritySchemeItemProvider.dispose();
	}

}
