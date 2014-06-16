package com.cs.means;

import java.util.Vector;
import java.sql.*;

import com.cs.base.Business;

public class find_goods_info {
	
	private static final String select1 =
			"select * from Merchandise where SortNumber=?";
	private static final String select2 =
            "select * from Merchandise where MerchandiseNumber=?";
    private static final String select3 =
            "select * from Merchandise where MerchandiseName=?";
    private static final String select4 =
            "select * from Merchandise where TreatyCode=?";
    private static final String select5 =
            "select * from User where CardId=? ";
    private static final String select6 =
    		"select * from User where UserName=? and Password=? and UserGrade=?";
    private static final String select7 =
            "select * from b_sale where NextBack=?";
    private static final String select8 =  
            "select * from b_sale where Product_ID=? and NextBack=?";
    private static final String select9 =
            "select number from StockPile where MerchandiseNumber=?";
    private static final String select10 =
            "select * from StockPile where MerchandiseNumber=?";
    private static final String select11 =
            "select * from StockPile";
    private static final String select12 =
        "select * from User where remark!='管理员' ";
	//构造函数
	public find_goods_info() {
		// TODO Auto-generated constructor stub
	}
	
	public static Vector Select_User(String name, String password) {
        Vector vcUser = new Vector();
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pmst = null;
        try {
            conn = Business.getConnection();
            pmst = conn.prepareStatement(select6);
            pmst.setString(1, name);
            pmst.setString(2, password);
            pmst.setString(3, "管理员");
           
            rs = pmst.executeQuery();
            rs.next();
            vcUser.add(rs.getString(1));       
            vcUser.add(rs.getString(2));
            vcUser.add(rs.getString(3));
            vcUser.add(rs.getString(4));
            vcUser.add(rs.getString(10));
           
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
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
        return vcUser;
    }

}
