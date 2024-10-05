package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asdy extends aonm implements aooz {
    public static final asdy a;
    private static volatile aopf q;
    public int b;
    public arnd c;
    public aulq e;
    public avxs f;
    public boolean g;
    public int h;
    public apxf i;
    public asdx k;
    public arvr l;
    public apxf m;
    public boolean n;
    public asdz o;
    private aqzg r;
    private aota s;
    private byte t = 2;
    public aony d = emptyProtobufList();
    public String j = "";
    public aomf p = aomf.b;

    static {
        asdy asdyVar = new asdy();
        a = asdyVar;
        aonm.registerDefaultInstance(asdy.class, asdyVar);
    }

    private asdy() {
    }

    public final void a() {
        aony aonyVar = this.d;
        if (aonyVar.c()) {
            return;
        }
        this.d = aonm.mutableCopy(aonyVar);
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
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001̉\u0010\u0000\u0001\t\u0001ᐉ\u0000\u0003Л\u0004ᐉ\u0002\u0005ဇ\u0003\u0006င\u0004\u0007ᐉ\u0005\bဉ\b\tဈ\u0006\nᐉ\t\u000bဇ\n\fᐉ\r\rည\u000e\u000eᐉ\u0001\u000fᐉ\u000b\u0010ဉ\u0007̉ᐉ\f", new Object[]{"b", "c", "d", asdz.class, "f", "g", "h", "i", "l", "j", "m", "n", "s", "p", "e", "o", "k", "r"});
            case NEW_MUTABLE_INSTANCE:
                return new asdy();
            case NEW_BUILDER:
                return new aone((byte[][]) null, (int[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = q;
                if (aopfVar == null) {
                    synchronized (asdy.class) {
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
