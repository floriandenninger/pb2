package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ardq extends aonm implements aooz {
    public static final ardq a;
    private static volatile aopf g;
    public int b;
    public int d;
    public int e;
    public int f;
    private byte h = 2;
    public String c = "";

    static {
        ardq ardqVar = new ardq();
        a = ardqVar;
        aonm.registerDefaultInstance(ardq.class, ardqVar);
    }

    private ardq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0005ဌ\u0004", new Object[]{"b", "c", "d", aqze.j, "e", aqze.k, "f", aqze.i});
            case NEW_MUTABLE_INSTANCE:
                return new ardq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (ardq.class) {
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
