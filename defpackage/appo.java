package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class appo extends aonm implements aooz {
    public static final appo a;
    private static volatile aopf s;
    public int b;
    public aqyg c;
    public aqyg f;
    public appq i;
    public aqyg j;
    public int k;
    public int l;
    public int m;
    public aqpi n;
    public aqyg p;
    public aqyg q;
    public aqyg r;
    private byte t = 2;
    public String d = "";
    public boolean e = true;
    public String g = "";
    public boolean h = true;
    public aony o = emptyProtobufList();

    static {
        appo appoVar = new appo();
        a = appoVar;
        aonm.registerDefaultInstance(appo.class, appoVar);
    }

    private appo() {
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
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0002\u0013\u0010\u0000\u0001\b\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0006ᐉ\u0005\u0007ဈ\u0006\bဇ\u0007\nဉ\t\u000bင\u000b\fင\f\rင\r\u000eᐉ\u000e\u000fЛ\u0010ᐉ\n\u0011ᐉ\u000f\u0012ᐉ\u0010\u0013ᐉ\u0011", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "k", "l", "m", "n", "o", aqyg.class, "j", "p", "q", "r"});
            case NEW_MUTABLE_INSTANCE:
                return new appo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = s;
                if (aopfVar == null) {
                    synchronized (appo.class) {
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
