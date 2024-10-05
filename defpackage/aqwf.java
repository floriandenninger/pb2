package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqwf extends aonm implements aooz {
    public static final aqwf a;
    private static volatile aopf g;
    public int b;
    public aubz c;
    public auuf d;
    public avzv e;
    public arhz f;
    private apsa h;
    private athb i;
    private atha j;
    private auip k;
    private awal l;
    private aqbj m;
    private aqcb n;
    private aqcj o;
    private aqcq p;
    private aqcp q;
    private aqdb r;
    private aqgn s;
    private aphj t;
    private aqrf u;
    private byte v = 2;

    static {
        aqwf aqwfVar = new aqwf();
        a = aqwfVar;
        aonm.registerDefaultInstance(aqwf.class, aqwfVar);
    }

    private aqwf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.v);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.v = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\ue1d6\u181e\uf492䤳\u0012\u0000\u0000\u0012\ue1d6\u181eᐉ\u0006\uf243\u181fᐉ\u0000\uf143ᠤᐉ\rﳴᠰᐉ\u0003\ue567ᠲᐉ\n\uef41ᠸᐉ\b\uf2b9ᥚᐉ\f\ue9c4ᯣᐉ\u0001\uea1cᯣᐉ\t\uef20Ḅᐉ\u0005\uee1dἍᐉ\u000f\uf55dΆᐉ\u0002\uec81⟕ᐉ\u0010\uf127⩲ᐉ\u0007\uf5b1⼞ᐉ\u000e\uf76d㋴ᐉ\u000bﶜ㌆ᐉ\u0004\uf492䤳ᐉ\u0011", new Object[]{"b", "e", "h", "r", "c", "o", "m", "q", "i", "n", "k", "t", "j", "f", "l", "s", "p", "d", "u"});
            case NEW_MUTABLE_INSTANCE:
                return new aqwf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aqwf.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
