/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data2;

/**
 *
 * @author Laura Barreto
 * @param <D> Generic object type
 */

public interface Sequence<D> {
    
    /**
     * Example: [a, b, c, d].here() = a
     * @return Generic object D that is at the current location in sequence being looked at
     */


    public D here();

    /**
     * Example: [a, b, c, d].hasNext() = true;
     * @return Boolean that represents if end of sequence has not been reached
     */
    public boolean hasNext();
    
     /**
     * Example: [a, b, c, d].next() = [b, c, d];
     * @return Sequence containing generic objects D that follow the current object
     */
    public Sequence<D> next();

    /**
     * Example: [a, b, c, d].seqToString() = "a b c d"
     * @return String of the Sequence
     */
    public String seqToString();
}
