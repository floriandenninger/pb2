package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aupu extends aonm implements aooz {
    public static final aupu a;
    private static volatile aopf q;
    public int b;
    public int c;
    public aqyg d;
    public aqyg e;
    public boolean f;
    public boolean g;
    public apxf h;
    public apxf i;
    public aqyg j;
    public aqyg k;
    public aupz l;
    public aupz m;
    public aulq n;
    private aota r;
    private byte s = 2;
    public aony o = emptyProtobufList();
    public aomf p = aomf.b;

    static {
        aupu aupuVar = new aupu();
        a = aupuVar;
        aonm.registerDefaultInstance(aupu.class, aupuVar);
    }

    private aupu() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.s);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0012\u000f\u0000\u0001\n\u0002ᐉ\u0004\u0003ᐉ\u0005\u0004ဇ\u0006\u0005ᐉ\t\u0006ᐉ\n\u0007ᐉ\u000b\b\u001b\tဇ\u0007\nᐉ\f\u000bᐉ\u000e\fᐉ\u0011\rည\u0012\u000eᐉ\r\u000fဌ\u0000\u0012ᐉ\u000f", new Object[]{"b", "d", "e", "f", "h", "i", "j", "o", auqx.class, "g", "k", "m", "r", "p", "l", "c", auqy.a, "n"});
            case NEW_MUTABLE_INSTANCE:
                return new aupu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = q;
                if (aopfVar == null) {
                    synchronized (aupu.class) {
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
