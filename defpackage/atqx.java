package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atqx extends aonm implements aooz {
    public static final atqx a;
    private static volatile aopf q;
    public int b;
    public avgg d;
    public atot e;
    public long h;
    public long i;
    public aqyg k;
    public long o;
    public atqw p;
    private byte r = 2;
    public String c = "";
    public String f = "";
    public String g = "";
    public String j = "";
    public String l = "";
    public String m = "";
    public String n = "";

    static {
        atqx atqxVar = new atqx();
        a = atqxVar;
        aonm.registerDefaultInstance(atqx.class, atqxVar);
    }

    private atqx() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u0011\u000e\u0000\u0000\u0004\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\b\tᐉ\t\nဈ\n\fဈ\u000b\rဈ\f\u0010ဂ\r\u0011ᐉ\u000e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new atqx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = q;
                if (aopfVar == null) {
                    synchronized (atqx.class) {
                        aopfVar = q;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            q = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
