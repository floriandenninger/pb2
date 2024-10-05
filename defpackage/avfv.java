package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avfv extends aonm implements aooz {
    public static final avfv a;
    private static volatile aopf n;
    public int b;
    public avfk c;
    public avfl d;
    public avfw e;
    public avft f;
    public avfu g;
    public avfp h;
    public apjw i;
    public apkb j;
    public avfx k;
    public avfs l;
    public avfz m;
    private avfn o;
    private avfo p;
    private avfy q;
    private avfm r;
    private aucw s;
    private avfr t;
    private avfq u;
    private avkv v;
    private byte w = 2;

    static {
        avfv avfvVar = new avfv();
        a = avfvVar;
        aonm.registerDefaultInstance(avfv.class, avfvVar);
    }

    private avfv() {
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001ￆᡇ\ue299뤞\u0013\u0000\u0000\u0010ￆᡇᐉ\u000b\uefe2ㅃဉ\u0003\uf2ff㌙ᐉ\b\ue25a㌤ᐉ\u0004\ue7fe㑇ᐉ\u0001\ue6ed㒖ဉ\u0007ﷁ㔾ᐉ\t\ue678㛸ᐉ\u0000\uefc0㨊ᐉ\u000e\ue95e㴥ᐉ\u0005︧䷧ဉ\u000f\ue4f3乴ᐉ\n\ueb7a僅ᐉ\u0010\ue923幥ᐉ\u0006\ue0bf波ᐉ\u0011\ue8eb鑡ᐉ\u0002\uf23c飏ᐉ\f\uf497꽐ᐉ\u0014\ue299뤞ᐉ\u0016", new Object[]{"b", "i", "e", "g", "p", "d", "f", "s", "c", "k", "q", "l", "h", "m", "r", "t", "o", "j", "u", "v"});
            case NEW_MUTABLE_INSTANCE:
                return new avfv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (avfv.class) {
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
