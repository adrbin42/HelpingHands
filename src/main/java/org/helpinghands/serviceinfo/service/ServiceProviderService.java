package org.helpinghands.serviceinfo.service;

import org.helpinghands.serviceinfo.domain.Service;
import org.helpinghands.serviceinfo.domain.ServiceProvider;

//import java.util.Comparator;
import java.util.List;

public interface ServiceProviderService {
    //Add, Update and delete Service Provider
    ServiceProvider add(ServiceProvider serviceProvider);
    void add(List<ServiceProvider> serviceProviders);
    void update(ServiceProvider serviceProvider);
    void delete(int id);

    //Get Service Provider by ID
    ServiceProvider getServiceProviderById(int id);

    //Get a list of services that the Service Provider offers
//    List<Service> getServicesOffered(int id);

    //Add a Service that is will be connected to a Service Provider
   L addService(Service service);

    //Delete a Service that will be connected to a Service Provider
    List deleteService(Service service);

    //Get a list of Service Providers
    List<ServiceProvider> getAllServiceProviders();

    //Get a list of all Service Providers sorted by city, state, zip or name
    List<ServiceProvider> sortAllByCity();
    List<ServiceProvider> sortAllByState();
    List<ServiceProvider> sortAllByZipCode();
    List<ServiceProvider> sortAllByName();

    //Get a list of Service Providers for a particular city, state, zip or name
    List<ServiceProvider> getListForCity(String city);
    List<ServiceProvider> getListForState(String state);
    List<ServiceProvider> getListForZipCode(int zip);
    List<ServiceProvider> getListForName(String name);

    //Get a list of Service Providers who provide specific services
    ServiceProvider getSvcProvidersByType(Service TypeOfService);

    //Get a list of Service Providers who provide services to
    //a specific group men, women etc.
    List<Service> getSvcByGroupServed();

}