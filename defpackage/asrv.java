package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asrv extends aonm implements aooz {
    public static final asrv a;
    private static volatile aopf l;
    public int b;
    public String c = "";
    public long d;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    static {
        asrv asrvVar = new asrv();
        a = asrvVar;
        aonm.registerDefaultInstance(asrv.class, asrvVar);
    }

    private asrv() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဃ\u0002\u0003ဃ\u0003\u0004ဇ\u0004\u0005ဇ\u0005\u0006ဇ\u0006\u0007ဌ\u0007\nဌ\n\fဇ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", assi.e, "j", assi.c, "k"});
            case NEW_MUTABLE_INSTANCE:
                return new asrv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (asrv.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
