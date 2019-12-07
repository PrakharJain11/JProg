/*package com.prakharjain.ThreadConcept;

import java.util.List;

public class PaginationHelper<I>{

	  *//**
	   * The constructor takes in an array of items and a integer indicating how many
	   * items fit within a single page
	   *//*
	  int pageCount;
	private List<I> collection;
	private int itemsPerPage;
	  public PaginationHelper(List<I> collection, int itemsPerPage) {
	      this.collection=collection;
	      this.itemsPerPage=itemsPerPage;
	      pageCount = (collection.size()-1)/itemsPerPage +1;
	     }
	  
	  *//**
	   * returns the number of items within the entire collection
	   *//*
	  public int itemCount() {
	    return collection.size();
	  }
	  
	  *//**
	   * returns the number of pages
	   *//*
	  public int pageCount() {
	    return pageCount;
	  }
	  
	  *//**
	   * returns the number of items on the current page. page_index is zero based.
	   * this method should return -1 for pageIndex values that are out of range
	   *//*
	  public int pageItemCount(int pageIndex) {
	    return pageCount-pageIndex > 1?itemPerPage:collection.size()%itemsPerPage;
	      }
	  
	  *//**
	   * determines what page an item is on. Zero based indexes
	   * this method should return -1 for itemIndex values that are out of range
	   *//*
	  public int pageIndex(int itemIndex) {
	    if(collection.size()/itemIndex>0)
	      return collection.size()/itemIndex;
	    else if(collection.size()/itemIndex==0)
	    {
	      return collection.size()-1/itemIndex;
	    }
	    else if(collection.size()<itemIndex)
	      return -1;
	     
	  }
}
*/