package com.cs.means;

import java.sql.*;

import com.cs.base.*;


public class Insert_goods {
    public Insert_goods() {
    }

    private static final String insert1 = "insert stock(MerchandiseNumber,MerchandiseName,department,number,unitprice,overallmoney,data,paymentdate) values(?,?,?,?,?,?,?,?)";
    private static final String insert2 = "insert Merchandise(MerchandiseNumber,TreatyCode, SortNumber,MerchandiseName, RetailPrice,MerchandiseSpec, Units,PurchasePrice, CheckTerm, Remark) values(?,?,?,?,?,?,?,?,?,?)";		//插入商品SQL语句
    private static final String insert3 = "insert User(cardId,UserName,IDcard,password,CardDate,UserGrade,term,integral,agio,remark) values(?,?,?,?,?,?,?,?,?,?)";
    private static final String insert4 = "insert sale (ProductID,SaleDate,Number,Price,Discount,VIP_ID,ProductName) values(?,?,?,?,?,?,?)";
                                                        //商品编号  销售日期  商品数量 商品单价 折扣   会员卡号 商品名称
    private static final String insert5 = "insert e_stock(MerNumber,Number,PurchasePrice,PutData,StoreHouse_ID,dealWithHuman,downName,inout) values(?,?,?,?,?,?,?,?)";
    private static final String insert6 = "insert b_sale(Product_ID,ProductName,Number,Price,JtDate,SuperMarket,NextBack,reason) values(?,?,?,?,?,?,?,?)";
    public static int Insert_stock(String MerchandiseNumber,
                                   String MerchandiseName,
                                   String department,
                                   String number, String unitprice,
                                   String overallmoney, String date,
                                   String paymentdate) {
        int stock = 0;
        Connection conn = null;
        PreparedStatement pmst = null;
        conn = Business.getConnection();

        try {
            pmst = conn.prepareStatement(insert1);
            pmst.setString(1, MerchandiseNumber);
            pmst.setString(2, MerchandiseName);
            pmst.setString(3, department);
            pmst.setString(4, number);
            pmst.setString(5, unitprice);
            pmst.setString(6, overallmoney);
            pmst.setString(7, date);
            pmst.setString(8, paymentdate);
            stock = pmst.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (pmst != null) {
                    pmst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex1) {
                ex1.printStackTrace();
            }
        }
        return stock;
    }

	public static int Insert_merchandise(String MerchandiseNumber,String TreatyCode, String SortNumber,String MerchandiseName, double RetailPrice,String MerchandiseSpec,String  Units,double PurchasePrice, double CheckTerm,String  Remark) {
	    int stock = 0;
	    Connection conn = null;
	    PreparedStatement pmst = null;
	    conn = Business.getConnection();
	
	    try {
	        pmst = conn.prepareStatement(insert2);
	        pmst.setString(1, MerchandiseNumber);
	        pmst.setString(2, TreatyCode);
	        pmst.setString(3, SortNumber);
	        pmst.setString(4, MerchandiseName);
	        pmst.setDouble(5, RetailPrice);
	        pmst.setString(6, MerchandiseSpec);
	        pmst.setString(7, Units);
	        pmst.setDouble(8, PurchasePrice);
	        pmst.setDouble(9, CheckTerm);
	        pmst.setString(10, Remark);
	
	        stock = pmst.executeUpdate();
	
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    } finally {
	        try {
	            if (pmst != null) {
	                pmst.close();
	            }
	            if (conn != null) {
	                conn.close();
	            }
	        } catch (Exception ex1) {
	            ex1.printStackTrace();
	        }
	    }
	    return stock;
	}

    public static int Insert_User(String cardId, String name, String IDcard,
                                  String password, String CardDate,
                                  String UserGrade, String term,
                                  String integral, String agio, String remark) {
        int insert_User=0;
        Connection conn=null;
        PreparedStatement pmst =null;
        conn=Business.getConnection();
        try {
            pmst = conn.prepareStatement(insert3);
            pmst.setString(1,cardId);
            pmst.setString(2,name);
            pmst.setString(3,IDcard);
            pmst.setString(4,password);
            pmst.setString(5,CardDate);
            pmst.setString(6,UserGrade);
            pmst.setString(7,term);
            pmst.setString(8,integral);
            pmst.setString(9,agio);
            pmst.setString(10,remark);
            insert_User=pmst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally {
            try {
                if (pmst != null) {
                    pmst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex1) {
                ex1.printStackTrace();
            }
        }
        return insert_User;

    }
	public static int Insert_Sale(String Product_ID,String SaleDate,int Number,double Price,String Discount,String VIP_ID,String ProductName) {
	       int insert_Sale=0;
	       Connection conn=null;
	       PreparedStatement pmst =null;
	       conn=Business.getConnection();
	       try {
	           pmst = conn.prepareStatement(insert4);	//使用预编译语句
	           pmst.setString(1,Product_ID);	//商品编号
	           pmst.setString(2,SaleDate);		//交易时间
	           pmst.setInt(3,Number);			//数量
	           pmst.setDouble(4,Price);			//价格	
	           pmst.setString(5,Discount);		//折扣
	           pmst.setString(6,VIP_ID);		//会员ID
	           pmst.setString(7,ProductName);	//商品名称
	           insert_Sale=pmst.executeUpdate();	//执行更新
	       } catch (SQLException ex) {
	           ex.printStackTrace();
	       }finally {
	           try {
	               if (pmst != null) {
	                   pmst.close();
	               }
	               if (conn != null) {
	                   conn.close();
	               }
	           } catch (Exception ex1) {
	               ex1.printStackTrace();
	           }
	       }
	       return insert_Sale;
	
	}
	public static int Insert_e_stock(String MerNumber,int Number,double PurchasePrice,String PutData,String StoreHouse_ID,String dealWithHuman,String downName,String inout) {
	       int insert_e_stock=0;
	       Connection conn=null;
	       PreparedStatement pmst =null;
	       conn=Business.getConnection();
	       try {
	           pmst = conn.prepareStatement(insert5);	//预编译语句
	           pmst.setString(1,MerNumber);			//商品编号
	           pmst.setDouble(2,Number);			//商品数量
	           pmst.setDouble(3,PurchasePrice);		//商品价格
	           pmst.setString(4,PutData);			//日期
	           pmst.setString(5,StoreHouse_ID);		//仓库号
	           pmst.setString(6,dealWithHuman);		//经手人
	           pmst.setString(7,downName);			//填单人
	           pmst.setString(8,inout);			//出入库
	           insert_e_stock=pmst.executeUpdate();
	       } catch (SQLException ex) {
	           ex.printStackTrace();
	       }finally {
	           try {
	               if (pmst != null) {
	                   pmst.close();
	               }
	               if (conn != null) {
	                   conn.close();
	               }
	           } catch (Exception ex1) {
	               ex1.printStackTrace();
	           }
	       }
	       return insert_e_stock;
	
	}

	public static int Insert_NextBackStock(String Product_ID,String ProductName,double Number,double Price,String JtDate,String SuperMarket,String NextBack,String reason) {
	       int insert_NextBackStock=0;
	       Connection conn=null;
	       PreparedStatement pmst =null;
	       conn=Business.getConnection();
	       try {
	           pmst = conn.prepareStatement(insert6);	//使用预编译语句插入
	           pmst.setString(1,Product_ID);			//依次将参数值设置到SQL语句中
	           pmst.setString(2,ProductName);
	           pmst.setDouble(3,Number);
	           pmst.setDouble(4,Price);
	           pmst.setString(5,JtDate);
	           pmst.setString(6,SuperMarket);
	           pmst.setString(7,NextBack);
	           pmst.setString(8,reason);
	           insert_NextBackStock=pmst.executeUpdate();	//执行插入操作
	       } catch (SQLException ex) {
	           ex.printStackTrace();
	       }finally {
	           try {
	               if (pmst != null) {
	                   pmst.close();
	               }
	               if (conn != null) {
	                   conn.close();
	               }
	           } catch (Exception ex1) {
	               ex1.printStackTrace();
	           }
	       }
	       return insert_NextBackStock;
	
	}


}
