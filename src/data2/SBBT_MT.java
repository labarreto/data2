/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data2;

/**
 *
 * @author ldbruby95
 */
//empty self-balancing binary tree
public class SBBT_MT<D extends Comparable> implements finiteBag<D> {
    
    SBBT_MT() {
    }
    finiteBag left;
    D here;
    finiteBag right;
    
    public static finiteBag empty() {
        return new SBBT_MT();
    }

    public int cardinality() {
        return 0;
    }

    // (isEmptyHuh t) --> boolean where t is a finite bag
    public boolean isEmptyHuh() {
        return true;
    }

    // (member t elt) --> boolean where t is a finite-bag and elt is an int
    public boolean member(D elt) {
        return false;
    }

    // (remove t elt) --> finite-bag where t is a finite-bag and elt is an int
    public finiteBag remove(D elt) {
        return this;
    }

    public finiteBag add(D elt) {
        return new SBBT_ST(empty(), elt, empty());
    }
        // (add t elt) --> finite-set where t is a finite-set and elt is an ent

    public finiteBag union(finiteBag u) {
        return u;
    }

    public finiteBag inter(finiteBag u) {
        return new SBBT_MT();
    }

    public boolean equal(finiteBag u) {
        return u.isEmptyHuh();
    }

    public boolean subset(finiteBag u) {
        return false;
    }

    public int multiplicity(D elt) {
        return 0;
    } //multiplicity of a member of a multiset
    //is the number of times it appears in the multiset. 

}
