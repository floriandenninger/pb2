package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqpd extends aonm implements aooz {
    public static final aqpd a;
    private static volatile aopf m;
    public int b;
    public long d;
    public long e;
    public boolean f;
    public String i;
    public aonu j;
    public aomf k;
    public int l;
    public String c = "";
    public String g = "";
    public String h = "";

    static {
        aqpd aqpdVar = new aqpd();
        a = aqpdVar;
        aonm.registerDefaultInstance(aqpd.class, aqpdVar);
    }

    private aqpd() {
        aomf aomfVar = aomf.b;
        this.i = "";
        this.j = emptyIntList();
        this.k = aomf.b;
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\bဈ\u0007\t\u0016\nည\b\u000bင\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new aqpd();
            case NEW_BUILDER:
                return new aone((float[]) null, (boolean[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (aqpd.class) {
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
