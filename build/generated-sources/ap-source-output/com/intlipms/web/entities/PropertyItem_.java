package com.intlipms.web.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-25T16:34:39")
@StaticMetamodel(PropertyItem.class)
public class PropertyItem_ { 

    public static volatile SingularAttribute<PropertyItem, Integer> itemId;
    public static volatile SingularAttribute<PropertyItem, String> itemName;
    public static volatile SingularAttribute<PropertyItem, Date> dateCreated;
    public static volatile SingularAttribute<PropertyItem, String> updatedBy;
    public static volatile SingularAttribute<PropertyItem, String> createdBy;
    public static volatile SingularAttribute<PropertyItem, String> globalId;
    public static volatile SingularAttribute<PropertyItem, Boolean> replicationStatus;
    public static volatile SingularAttribute<PropertyItem, String> hotelId;
    public static volatile SingularAttribute<PropertyItem, String> itemDesc;
    public static volatile SingularAttribute<PropertyItem, Date> dateUpdated;

}