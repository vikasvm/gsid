package gov.nih.nci.cagrid.identifiers.common;

import java.rmi.RemoteException;

/**
 * The Naming Authority service enables users to maintain and resolve identifiers in the grid
 *
 * This class is autogenerated, DO NOT EDIT.
 * 
 * This interface represents the API which is accessable on the grid service from the client. 
 * 
 * @created by Introduce Toolkit version 1.3
 * 
 */
public interface IdentifiersNAServiceI {

  public org.oasis.wsrf.properties.GetMultipleResourcePropertiesResponse getMultipleResourceProperties(org.oasis.wsrf.properties.GetMultipleResourceProperties_Element params) throws RemoteException ;

  public org.oasis.wsrf.properties.GetResourcePropertyResponse getResourceProperty(javax.xml.namespace.QName params) throws RemoteException ;

  public org.oasis.wsrf.properties.QueryResourcePropertiesResponse queryResourceProperties(org.oasis.wsrf.properties.QueryResourceProperties_Element params) throws RemoteException ;

  /**
   * Creates a new identifier using the provided metadata (IdentifierValues)
   *
   * @param identifierData
   *	Identifier metadata to be associated with the new identifier
   * @return The new identifier generated by the naming authority
   * @throws NamingAuthorityConfigurationFault
   *	A configuration error was detected by the naming authority
   * @throws InvalidIdentifierFault
   *	The provided identifier is invalid, or does not exist
   * @throws NamingAuthoritySecurityFault
   *	User is not authorized to perform the operation
   * @throws InvalidIdentifierValuesFault
   *	Invalid identifier values (metadata) were provided by the user
   */
  public org.apache.axis.types.URI createIdentifier(namingauthority.IdentifierData identifierData) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault ;

  /**
   * Returns metadata associated with the provided identifier
   *
   * @param identifier
   * @return The metadata associated with the provided identifier
   * @throws NamingAuthorityConfigurationFault
   *	A configuration error has been detected
   * @throws InvalidIdentifierFault
   *	The provided identifier does not exist
   * @throws NamingAuthoritySecurityFault
   *	User is not authorized to perform the operation
   */
  public namingauthority.IdentifierData resolveIdentifier(java.lang.String identifier) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault ;

  /**
   * This operation registers a Specimen Identifier.
   *
   * @param suggestedIdentifier
   * @param parentIdentifiers
   * @throws NamingAuthorityConfigurationFault
   *	
   * @throws InvalidIdentifierValuesFault
   *	
   * @throws InvalidIdentifierFault
   *	
   * @throws NamingAuthoritySecurityFault
   *	
   */
  public java.lang.String registerGSID(java.lang.String suggestedIdentifier,java.lang.String[] parentIdentifiers) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault ;

  /**
   * Add the current user as an site that has information about the input specimen identifier.
   *
   * @param identifier
   * @throws NamingAuthorityConfigurationFault
   *	
   * @throws InvalidIdentifierValuesFault
   *	
   * @throws InvalidIdentifierFault
   *	
   * @throws NamingAuthoritySecurityFault
   *	
   */
  public org.apache.axis.types.URI addSite(java.lang.String identifier) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault ;

  /**
   * Generates a batch of valid UUIDs.
   *
   * @param numOfIdentifiers
   * @throws NamingAuthorityConfigurationFault
   *	
   * @throws NamingAuthoritySecurityFault
   *	
   */
  public java.lang.String[] generateIdentifiers(int numOfIdentifiers) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault ;

  /**
   * Return the parent hierarchy of the input Specimen Identifier
   *
   * @param identifier
   * @throws NamingAuthorityConfigurationFault
   *	
   * @throws NamingAuthoritySecurityFault
   *	
   * @throws InvalidIdentifierValuesFault
   *	
   * @throws InvalidIdentifierFault
   *	
   */
  public namingauthority.Tree getParentHierarchy(java.lang.String identifier) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault ;

  /**
   * Return the parent hierarchy of the input Specimen Identifier.
   *
   * @param identifier
   * @throws NamingAuthorityConfigurationFault
   *	
   * @throws InvalidIdentifierFault
   *	
   * @throws InvalidIdentifierValuesFault
   *	
   * @throws NamingAuthoritySecurityFault
   *	
   */
  public namingauthority.Tree getChildHierarchy(java.lang.String identifier) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault ;

  /**
   * Registers a Site.
   *
   * @param application
   * @param applicationURL
   * @param applicationVersion
   * @param contactName
   * @param contactEmail
   * @param contactPhone
   * @param organization
   * @throws InvalidIdentifierFault
   *	
   * @throws InvalidIdentifierValuesFault
   *	
   * @throws NamingAuthorityConfigurationFault
   *	
   * @throws NamingAuthoritySecurityFault
   *	
   */
  public void registerSite(java.lang.String application,java.lang.String applicationURL,java.lang.String applicationVersion,java.lang.String contactName,java.lang.String contactEmail,java.lang.String contactPhone,java.lang.String organization) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthoritySecurityFault ;

  /**
   * validates an identifier
   *
   * @param identifier
   * @throws InvalidIdentifierFault
   *	
   * @throws InvalidIdentifierValuesFault
   *	
   * @throws NamingAuthorityConfigurationFault
   *	
   */
  public boolean validateIdentifier(java.lang.String identifier) throws RemoteException, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierFault, gov.nih.nci.cagrid.identifiers.stubs.types.InvalidIdentifierValuesFault, gov.nih.nci.cagrid.identifiers.stubs.types.NamingAuthorityConfigurationFault ;

}

