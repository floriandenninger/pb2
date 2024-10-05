package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awvg extends aonm implements aooz {
    public static final awvg a;
    private static volatile aopf n;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public int j;
    public long k;
    public long l;
    public String g = "";
    public String h = "";
    public String i = "";
    public String m = "";

    static {
        awvg awvgVar = new awvg();
        a = awvgVar;
        aonm.registerDefaultInstance(awvg.class, awvgVar);
    }

    private awvg() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0006ဈ\u0005\bဈ\u0007\tဈ\b\nင\t\u000bဂ\n\fဂ\u000b\rဈ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new awvg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (awvg.class) {
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
