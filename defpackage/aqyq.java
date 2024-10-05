package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqyq extends aonm implements aooz {
    public static final aqyq a;
    private static volatile aopf g;
    public int b;
    public int c;
    public apxf e;
    public boolean f;
    private byte h = 2;
    public String d = "";

    static {
        aqyq aqyqVar = new aqyq();
        a = aqyqVar;
        aonm.registerDefaultInstance(aqyq.class, aqyqVar);
    }

    private aqyq() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0004ᐉ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", armv.m, "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aqyq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aqyq.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
