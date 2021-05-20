/*
 * LibreClinica is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://libreclinica.org/license
 * LibreClinica, copyright (C) 2020
 */
package org.akaza.openclinica.domain.datamap;

//default package
//Generated Jul 31, 2013 2:03:33 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.akaza.openclinica.domain.DataMapDomainObject;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * ItemDataType generated by hbm2java
 */
@Entity
@Table(name = "item_data_type")
@GenericGenerator(name = "id-generator", strategy = "native", parameters = { @Parameter(name = "sequence_name", value = "item_data_type_item_data_type_id_seq") })
public class ItemDataType extends DataMapDomainObject {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6588968518793637354L;
	private int itemDataTypeId;
    private String code;
    private String name;
    private String definition;
    private String reference;

    public ItemDataType() {
    }

    public ItemDataType(int itemDataTypeId) {
        this.itemDataTypeId = itemDataTypeId;
    }

    public ItemDataType(int itemDataTypeId, String code, String name, String definition, String reference) {
        this.itemDataTypeId = itemDataTypeId;
        this.code = code;
        this.name = name;
        this.definition = definition;
        this.reference = reference;
    }

    @Id
    @Column(name = "item_data_type_id", unique = true, nullable = false)
    @GeneratedValue(generator = "id-generator")
    public int getItemDataTypeId() {
        return this.itemDataTypeId;
    }

    public void setItemDataTypeId(int itemDataTypeId) {
        this.itemDataTypeId = itemDataTypeId;
    }

    @Column(name = "code", length = 20)
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "definition", length = 1000)
    public String getDefinition() {
        return this.definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Column(name = "reference", length = 1000)
    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
