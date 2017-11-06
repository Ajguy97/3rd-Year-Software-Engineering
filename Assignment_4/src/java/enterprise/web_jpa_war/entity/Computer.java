/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprise.web_jpa_war.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Andre Godinez
 */
@Entity
@Table(name = "computer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Computer.findAll", query = "SELECT c FROM Computer c")
    , @NamedQuery(name = "Computer.findByPkId", query = "SELECT c FROM Computer c WHERE c.pkId = :pkId")
    , @NamedQuery(name = "Computer.findByCpu", query = "SELECT c FROM Computer c WHERE c.cpu = :cpu")
    , @NamedQuery(name = "Computer.findByMotherboard", query = "SELECT c FROM Computer c WHERE c.motherboard = :motherboard")
    , @NamedQuery(name = "Computer.findByMemory", query = "SELECT c FROM Computer c WHERE c.memory = :memory")
    , @NamedQuery(name = "Computer.findByStorage", query = "SELECT c FROM Computer c WHERE c.storage = :storage")
    , @NamedQuery(name = "Computer.findByGpu", query = "SELECT c FROM Computer c WHERE c.gpu = :gpu")
    , @NamedQuery(name = "Computer.findByPccase", query = "SELECT c FROM Computer c WHERE c.pccase = :pccase")
    , @NamedQuery(name = "Computer.findByPsu", query = "SELECT c FROM Computer c WHERE c.psu = :psu")})
public class Computer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PK_ID")
    private Integer pkId;
    @Size(max = 255)
    @Column(name = "Cpu")
    private String cpu;
    @Size(max = 255)
    @Column(name = "Motherboard")
    private String motherboard;
    @Size(max = 255)
    @Column(name = "Memory")
    private String memory;
    @Size(max = 255)
    @Column(name = "Storage")
    private String storage;
    @Size(max = 255)
    @Column(name = "Gpu")
    private String gpu;
    @Size(max = 255)
    @Column(name = "Pc_case")
    private String pccase;
    @Size(max = 255)
    @Column(name = "Psu")
    private String psu;

    public Computer() {
    }

    public Computer(Integer pkId) {
        this.pkId = pkId;
    }

    public Integer getPkId() {
        return pkId;
    }

    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getPccase() {
        return pccase;
    }

    public void setPccase(String pccase) {
        this.pccase = pccase;
    }

    public String getPsu() {
        return psu;
    }

    public void setPsu(String psu) {
        this.psu = psu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkId != null ? pkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Computer)) {
            return false;
        }
        Computer other = (Computer) object;
        if ((this.pkId == null && other.pkId != null) || (this.pkId != null && !this.pkId.equals(other.pkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enterprise.web_jpa_war.entity.Computer[ pkId=" + pkId + cpu+"]";
    }
    
}
