package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asfq extends aonm implements aooz {
    public static final asfq a;
    private static volatile aopf f;
    public int b;
    public Object d;
    public awhq e;
    public int c = 0;
    private byte g = 2;

    static {
        asfq asfqVar = new asfq();
        a = asfqVar;
        aonm.registerDefaultInstance(asfq.class, asfqVar);
    }

    private asfq() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0001\u0001\uf875ᯧ\ue893끟\b\u0000\u0000\b\uf875ᯧᐼ\u0000\uf437Ἳᐉ\u0007\ue642ⵆᐼ\u0000\ue35f䴂ᐼ\u0000\ued59嶲ᐼ\u0000\uec17巛ᐼ\u0000\uf475慨ᐼ\u0000\ue893끟ᐼ\u0000", new Object[]{"d", "c", "b", awgt.class, "e", atcp.class, avkt.class, auxg.class, avku.class, auxf.class, auwx.class});
            case NEW_MUTABLE_INSTANCE:
                return new asfq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (asfq.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
