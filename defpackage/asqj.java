package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asqj extends aonm implements aooz {
    public static final asqj a;
    private static volatile aopf s;
    public int b;
    public Object d;
    public long f;
    public aqyg h;
    public avgg i;
    public aqhu j;
    public aqyg k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public apxf q;
    public aulq r;
    private aqyg t;
    private aqyg u;
    private aqyg v;
    private aulq w;
    private aulq x;
    private aota y;
    private asqi z;
    public int c = 0;
    private byte A = 2;
    public String e = "";
    public String g = "";

    static {
        asqj asqjVar = new asqj();
        a = asqjVar;
        aonm.registerDefaultInstance(asqj.class, asqjVar);
    }

    private asqj() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.A);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.A = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0018\u0001\u0001\u0001\u001f\u0018\u0000\u0000\u000f\u0001ဈ\u0000\u0002ဃ\u0001\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0007\u0006်\u0000\u0007ᐼ\u0000\bᐼ\u0000\tဋ\t\nဋ\n\u000bဋ\u000b\fဋ\f\rဈ\u0003\u000eဋ\b\u000fᐉ\u0013\u0012ᐉ\u0011\u0013ᐉ\u0012\u0016ᐉ\u0002\u0017ᐉ\u0017\u0018ᐉ\u0018\u001cᐉ\u001a\u001dᐉ\u0015\u001eᐉ\u0016\u001fᐉ\u0006", new Object[]{"d", "c", "b", "e", "f", "h", "i", "k", aqyg.class, asqh.class, "m", "n", "o", "p", "g", "l", "q", "u", "v", "t", "r", "y", "z", "w", "x", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new asqj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = s;
                if (aopfVar == null) {
                    synchronized (asqj.class) {
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
