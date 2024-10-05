package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awaz extends aonm implements aooz {
    public static final awaz a;
    private static volatile aopf o;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public float i;
    public boolean j;
    public String k = "";
    public String l = "";
    public boolean m;
    public boolean n;
    private int p;

    static {
        awaz awazVar = new awaz();
        a = awazVar;
        aonm.registerDefaultInstance(awaz.class, awazVar);
    }

    private awaz() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0015\r\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0007ဇ\u0006\fဇ\u000b\u000eဇ\r\u000fခ\u000e\u0010ဇ\u000f\u0011ဈ\u0010\u0012ဈ\u0011\u0014ဇ\u0013\u0015ဇ\u0014", new Object[]{"p", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new awaz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (awaz.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
