
package com.thomsonreuters.wokmws.v3.woksearchlite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>retrieveParameters complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="retrieveParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstRecord" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sortField" type="{http://woksearchlite.v3.wokmws.thomsonreuters.com}sortField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveParameters", propOrder = {
    "firstRecord",
    "count",
    "sortField"
})
public class RetrieveParameters {

    protected int firstRecord;
    protected int count;
    protected List<SortField> sortField;

    /**
     * ��ȡfirstRecord���Ե�ֵ��
     * 
     */
    public int getFirstRecord() {
        return firstRecord;
    }

    /**
     * ����firstRecord���Ե�ֵ��
     * 
     */
    public void setFirstRecord(int value) {
        this.firstRecord = value;
    }

    /**
     * ��ȡcount���Ե�ֵ��
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * ����count���Ե�ֵ��
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the sortField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortField }
     * 
     * 
     */
    public List<SortField> getSortField() {
        if (sortField == null) {
            sortField = new ArrayList<SortField>();
        }
        return this.sortField;
    }

}