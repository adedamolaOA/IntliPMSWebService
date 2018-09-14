/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms.services;

import com.intlipms.web.controller.CompanyController;
import com.intlipms.web.controller.CompanyPrivilegesController;
import com.intlipms.web.controller.CompanyRoomRateController;
import com.intlipms.web.controller.CompanyStaffsController;
import com.intlipms.web.controller.CustomerController;
import com.intlipms.web.controller.CustomerPrivilegesController;
import com.intlipms.web.controller.CustomerRoomRateController;
import com.intlipms.web.controller.MaintenanceApprovalController;
import com.intlipms.web.controller.MaintenanceController;
import com.intlipms.web.controller.MaintenanceCostingController;
import com.intlipms.web.controller.MaintenanceFundsController;
import com.intlipms.web.entities.Company;
import com.intlipms.web.entities.CompanyCustomer;
import com.intlipms.web.entities.CompanyPrivileges;
import com.intlipms.web.entities.CompanyRommRate;
import com.intlipms.web.entities.Customer;
import com.intlipms.web.entities.CustomerPrivileges;
import com.intlipms.web.entities.CustomerRoomRate;
import com.intlipms.web.entities.MaintAproval;
import com.intlipms.web.entities.MaintCosting;
import com.intlipms.web.entities.MaintFunds;
import com.intlipms.web.entities.MaintRequest;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Adedamola
 */
@WebService(serviceName = "IntliPMSWebService")
public class IntliPMSWebService {

    
    /**
     * Web service operation
     * @param maintenanceRequest
     * @return 
     */
    @WebMethod(operationName = "uploadMaintenanceRequest")
    public Boolean uploadMaintenanceRequest(@WebParam(name = "maintenanceRequest") MaintRequest maintenanceRequest) {
        //TODO write your implementation code here:
        boolean uploadState;
        try{
           uploadState = new MaintenanceController().addMaintenanceRequest(maintenanceRequest);
        }catch(Exception e){
           uploadState = false; 
        }
        return uploadState;
    }

    /**
     * Web service operation
     * @param customer
     * @return 
     */
    @WebMethod(operationName = "uploadCustomer")
    public Boolean uploadCustomer(@WebParam(name = "customer") Customer customer) {
        //TODO write your implementation code here:
        boolean uploadState;
        try{
           uploadState = new CustomerController().add(customer);
        }catch(Exception e){
           uploadState = false; 
        }
        return uploadState;
    }

    /**
     * Web service operation
     * @param company
     * @return 
     */
    @WebMethod(operationName = "uploadCompany")
    public Boolean uploadCompany(@WebParam(name = "company") Company company) {
        boolean uploadState;
        try{
           uploadState = new CompanyController().add(company);
        }catch(Exception e){
           uploadState = false; 
        }
        return uploadState;
    }

    /**
     * Web service operation
     * @param customerCompany
     * @return 
     */
    @WebMethod(operationName = "uploadCompanyStaff")
    public Boolean uploadCompanyStaff(@WebParam(name = "customerCompany") CompanyCustomer customerCompany) {
        //TODO write your implementation code here:
        boolean uploadState;
        try{
           uploadState = new CompanyStaffsController().add(customerCompany);
        }catch(Exception e){
           uploadState = false; 
        }
        return uploadState;
    }

    /**
     * Web service operation
     * @param roomRate
     * @return 
     */
    @WebMethod(operationName = "uploadCompanyRoomRate")
    public Boolean uploadCompanyRoomRate(@WebParam(name = "roomRate") CompanyRommRate roomRate) {
        //TODO write your implementation code here:
        boolean uploadState;
        try{
           uploadState = new CompanyRoomRateController().add(roomRate);
        }catch(Exception e){
           uploadState = false; 
        }
        return uploadState;
    }

    /**
     * Web service operation
     * @param roomRate
     * @return 
     */
    @WebMethod(operationName = "uploadCustomerRoomRate")
    public Boolean uploadCustomerRoomRate(@WebParam(name = "roomRate") CustomerRoomRate roomRate) {
        boolean uploadState;
        try{
           uploadState = new CustomerRoomRateController().add(roomRate);
        }catch(Exception e){
           uploadState = false; 
        }
        return uploadState;
    }

    /**
     * Web service operation
     * @param privilege
     * @return 
     */
    @WebMethod(operationName = "uploadCustomerPrivileges")
    public Boolean uploadCustomerPrivileges(@WebParam(name = "privilege") CustomerPrivileges privilege) {
        boolean uploadState;
        try{
           uploadState = new CustomerPrivilegesController().add(privilege);
        }catch(Exception e){
           uploadState = false; 
        }
        return uploadState;
    }

    /**
     * Web service operation
     * @param privilege
     * @return 
     */
    @WebMethod(operationName = "uploadCompanyPrivileges")
    public Boolean uploadCompanyPrivileges(@WebParam(name = "privilege") CompanyPrivileges privilege) {
        boolean uploadState;
        try{
           uploadState = new CompanyPrivilegesController().add(privilege);
        }catch(Exception e){
           uploadState = false; 
        }
        return uploadState;
    }

    /**
     * Web service operation
     * @param approval
     * @return 
     */
    @WebMethod(operationName = "uploadMaintenanceRequestApproval")
    public Boolean uploadMaintenanceRequestApproval(@WebParam(name = "approval") MaintAproval approval) {
        boolean uploadState;
        try{
           uploadState = new MaintenanceApprovalController().add(approval);
        }catch(Exception e){
           uploadState = false; 
        }
        return uploadState;
    }

    /**
     * Web service operation
     * @param costing
     * @return 
     */
    @WebMethod(operationName = "uploadMaintenanceCosting")
    public Boolean uploadMaintenanceCosting(@WebParam(name = "costing") MaintCosting costing) {
       boolean uploadState;
        try{
           uploadState = new MaintenanceCostingController().add(costing);
        }catch(Exception e){
           uploadState = false; 
        }
        return uploadState;
    }

    /**
     * Web service operation
     * @param fund
     * @return 
     */
    @WebMethod(operationName = "uploadMaintenanceFunds")
    public Boolean uploadMaintenanceFunds(@WebParam(name = "fund") MaintFunds fund) {
        boolean uploadState;
        try{
           uploadState = new MaintenanceFundsController().add(fund);
        }catch(Exception e){
           uploadState = false; 
        }
        return uploadState;
    }

    
    
    
}
