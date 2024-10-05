package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atam extends aonm implements aooz {
    public static final atam a;
    private static volatile aopf n;
    public int b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public aszt g;
    public boolean h;
    public int i;
    public atag j;
    public String k = "";
    public long l;
    public atag m;

    static {
        atam atamVar = new atam();
        a = atamVar;
        aonm.registerDefaultInstance(atam.class, atamVar);
    }

    private atam() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\bဌ\u0007\tဉ\b\nဈ\t\u000bဂ\n\fဉ\u000b", new Object[]{"b", "c", asvv.u, "d", asvv.l, "e", "f", "g", "h", "i", atbj.a(), "j", "k", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new atam();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (atam.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
