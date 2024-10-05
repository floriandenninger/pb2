package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aspz extends aonm implements aooz {
    public static final aspz a;
    private static volatile aopf t;
    public int b;
    public Object d;
    public aqyg e;
    public asrh f;
    public long i;
    public long j;
    public aspv k;
    public aspx l;
    public aspy m;
    public aony n;
    public aulq o;
    public aulq p;
    public aomf q;
    public boolean r;
    public aqyg s;
    private aqyg u;
    private aota v;
    public int c = 0;
    private byte w = 2;
    public aony g = emptyProtobufList();
    public String h = "";

    static {
        aspz aspzVar = new aspz();
        a = aspzVar;
        aonm.registerDefaultInstance(aspz.class, aspzVar);
    }

    private aspz() {
        aonm.emptyProtobufList();
        this.n = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.q = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.w);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.w = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0013\u0001\u0001\u0001\u0018\u0013\u0000\u0002\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004ျ\u0000\u0005ဂ\u0006\u0006ᐉ\t\u0007ᐉ\n\bᐉ\u000b\tဂ\u0007\nဈ\u0005\u000bЛ\u0010ᐉ\r\u0012ᐉ\u000f\u0013ည\u0010\u0014ဇ\u0011\u0015ᐼ\u0000\u0016ဉ\u0002\u0017ᐉ\u0012\u0018ᐉ\u000e", new Object[]{"d", "c", "b", "e", "u", "g", asqb.class, "i", "k", "l", "m", "j", "h", "n", asqe.class, "o", "v", "q", "r", aspu.class, "f", "s", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new aspz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = t;
                if (aopfVar == null) {
                    synchronized (aspz.class) {
                        aopfVar = t;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            t = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
