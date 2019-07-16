//package com.ngthuc.syums.object.old;
//
//
//import com.ngthuc.syums.entity.Position;
//import com.ngthuc.syums.object.enumtype.ScopeKey;
//
//import javax.persistence.*;
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//@Table(name = "scope")
//public class Scope {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
//
//    @Column(name = "scope")
//    private ScopeKey scope;
//
//    @ManyToMany(mappedBy = "listScope",cascade = CascadeType.ALL)
//    private Set<Position> listPosition = new HashSet<>();
//
//    public Scope(ScopeKey scope) {
//        this.scope = scope;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public ScopeKey getScope() {
//        return scope;
//    }
//
//    public void setScope(ScopeKey scope) {
//        this.scope = scope;
//    }
//
//    public Set<Position> getListPosition() {
//        return listPosition;
//    }
//
//    public void setListPosition(Set<Position> listPosition) {
//        this.listPosition = listPosition;
//    }
//}
