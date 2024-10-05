package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aonb {
    DOUBLE(0, aona.SCALAR, aood.DOUBLE),
    FLOAT(1, aona.SCALAR, aood.FLOAT),
    INT64(2, aona.SCALAR, aood.LONG),
    UINT64(3, aona.SCALAR, aood.LONG),
    INT32(4, aona.SCALAR, aood.INT),
    FIXED64(5, aona.SCALAR, aood.LONG),
    FIXED32(6, aona.SCALAR, aood.INT),
    BOOL(7, aona.SCALAR, aood.BOOLEAN),
    STRING(8, aona.SCALAR, aood.STRING),
    MESSAGE(9, aona.SCALAR, aood.MESSAGE),
    BYTES(10, aona.SCALAR, aood.BYTE_STRING),
    UINT32(11, aona.SCALAR, aood.INT),
    ENUM(12, aona.SCALAR, aood.ENUM),
    SFIXED32(13, aona.SCALAR, aood.INT),
    SFIXED64(14, aona.SCALAR, aood.LONG),
    SINT32(15, aona.SCALAR, aood.INT),
    SINT64(16, aona.SCALAR, aood.LONG),
    GROUP(17, aona.SCALAR, aood.MESSAGE),
    DOUBLE_LIST(18, aona.VECTOR, aood.DOUBLE),
    FLOAT_LIST(19, aona.VECTOR, aood.FLOAT),
    INT64_LIST(20, aona.VECTOR, aood.LONG),
    UINT64_LIST(21, aona.VECTOR, aood.LONG),
    INT32_LIST(22, aona.VECTOR, aood.INT),
    FIXED64_LIST(23, aona.VECTOR, aood.LONG),
    FIXED32_LIST(24, aona.VECTOR, aood.INT),
    BOOL_LIST(25, aona.VECTOR, aood.BOOLEAN),
    STRING_LIST(26, aona.VECTOR, aood.STRING),
    MESSAGE_LIST(27, aona.VECTOR, aood.MESSAGE),
    BYTES_LIST(28, aona.VECTOR, aood.BYTE_STRING),
    UINT32_LIST(29, aona.VECTOR, aood.INT),
    ENUM_LIST(30, aona.VECTOR, aood.ENUM),
    SFIXED32_LIST(31, aona.VECTOR, aood.INT),
    SFIXED64_LIST(32, aona.VECTOR, aood.LONG),
    SINT32_LIST(33, aona.VECTOR, aood.INT),
    SINT64_LIST(34, aona.VECTOR, aood.LONG),
    DOUBLE_LIST_PACKED(35, aona.PACKED_VECTOR, aood.DOUBLE),
    FLOAT_LIST_PACKED(36, aona.PACKED_VECTOR, aood.FLOAT),
    INT64_LIST_PACKED(37, aona.PACKED_VECTOR, aood.LONG),
    UINT64_LIST_PACKED(38, aona.PACKED_VECTOR, aood.LONG),
    INT32_LIST_PACKED(39, aona.PACKED_VECTOR, aood.INT),
    FIXED64_LIST_PACKED(40, aona.PACKED_VECTOR, aood.LONG),
    FIXED32_LIST_PACKED(41, aona.PACKED_VECTOR, aood.INT),
    BOOL_LIST_PACKED(42, aona.PACKED_VECTOR, aood.BOOLEAN),
    UINT32_LIST_PACKED(43, aona.PACKED_VECTOR, aood.INT),
    ENUM_LIST_PACKED(44, aona.PACKED_VECTOR, aood.ENUM),
    SFIXED32_LIST_PACKED(45, aona.PACKED_VECTOR, aood.INT),
    SFIXED64_LIST_PACKED(46, aona.PACKED_VECTOR, aood.LONG),
    SINT32_LIST_PACKED(47, aona.PACKED_VECTOR, aood.INT),
    SINT64_LIST_PACKED(48, aona.PACKED_VECTOR, aood.LONG),
    GROUP_LIST(49, aona.VECTOR, aood.MESSAGE),
    MAP(50, aona.MAP, aood.VOID);

    private static final aonb[] ab;
    public final int Z;
    public final aona aa;

    static {
        aonb[] values = values();
        ab = new aonb[values.length];
        for (aonb aonbVar : values) {
            ab[aonbVar.Z] = aonbVar;
        }
    }

    aonb(int i, aona aonaVar, aood aoodVar) {
        this.Z = i;
        this.aa = aonaVar;
        aood aoodVar2 = aood.VOID;
        aona aonaVar2 = aona.SCALAR;
        int ordinal = aonaVar.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            Class cls = aoodVar.k;
        }
        if (aonaVar == aona.SCALAR) {
            aoodVar.ordinal();
        }
    }
}
