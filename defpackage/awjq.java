package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awjq extends aonm implements aooz {
    public static final awjq a;
    public static final aonk b;
    private static volatile aopf s;
    public int c;
    public String e;
    public String f;
    public String g;
    public long h;
    public int i;
    public avgg j;
    public awnd k;
    public aqyg l;
    public long m;
    public long n;
    public long o;
    public String p;
    public awjm q;
    public String r;
    private byte t = 2;
    public String d = "";

    static {
        awjq awjqVar = new awjq();
        a = awjqVar;
        aonm.registerDefaultInstance(awjq.class, awjqVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, awjqVar, awjqVar, null, 151, aoqn.MESSAGE, awjq.class);
    }

    private awjq() {
        aomf aomfVar = aomf.b;
        this.e = "";
        this.f = "";
        this.g = "";
        this.p = "";
        this.r = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.t);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0000\u0003\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဃ\u0005\u0007င\u0006\bᐉ\u0007\tᐉ\b\nဃ\n\u000bဃ\u000b\fဃ\f\rဈ\r\u000eဈ\u000f\u000fဉ\u000e\u0010ᐉ\t", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "r", "q", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new awjq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = s;
                if (aopfVar == null) {
                    synchronized (awjq.class) {
                        aopfVar = s;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            s = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
