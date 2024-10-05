package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqtx extends aonm implements aooz {
    public static final aqtx a;
    private static volatile aopf h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        aqtx aqtxVar = new aqtx();
        a = aqtxVar;
        aonm.registerDefaultInstance(aqtx.class, aqtxVar);
    }

    private aqtx() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0007ဌ\u0006", new Object[]{"b", "c", aqtk.l, "d", "e", aqtk.j, "f", aqtk.k, "g", apew.b});
            case NEW_MUTABLE_INSTANCE:
                return new aqtx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqtx.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
