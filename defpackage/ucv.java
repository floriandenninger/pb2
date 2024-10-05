package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ucv extends aonm implements aooz {
    public static final ucv a;
    private static volatile aopf m;
    public int b;
    public boolean c;
    public boolean d;
    public float e;
    public int f;
    public int g;
    public int h;
    public float i;
    public int j;
    public int k;
    public int l;
    private int n;

    static {
        ucv ucvVar = new ucv();
        a = ucvVar;
        aonm.registerDefaultInstance(ucv.class, ucvVar);
    }

    private ucv() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0003ခ\u0003\u0004ခ\u0007\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\b\tင\t\nင\n\u000bဇ\u0001\fဇ\u0002", new Object[]{"n", "b", sgo.u, "e", "i", "f", "g", "h", "j", "k", "l", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new ucv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (ucv.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
