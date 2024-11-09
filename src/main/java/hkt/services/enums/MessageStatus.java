package hkt.services.enums;

public enum MessageStatus {
    SENT,           // ส่งแล้ว
    PROCESSING,     // กำลังประมวลผล
    DELIVERED,      // ส่งถึงผู้รับแล้ว
    FAILED         // ส่งไม่สำเร็จ
}