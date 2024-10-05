package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arhg extends aonm implements aooz {
    public static final arhg a;
    private static volatile aopf o;
    public int b;
    public aqyg c;
    public apxf d;
    public avgg e;
    public aqyg f;
    public aqyg g;
    public aqyg h;
    public apxf i;
    public float l;
    public aqyg m;
    public arhf n;
    private aota p;
    private byte q = 2;
    public aony j = emptyProtobufList();
    public aomf k = aomf.b;

    static {
        arhg arhgVar = new arhg();
        a = arhgVar;
        aonm.registerDefaultInstance(arhg.class, arhgVar);
    }

    private arhg() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0001\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\u0007\t\u001b\nᐉ\b\u000bည\t\fခ\n\rᐉ\u000b\u000eဉ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", asus.class, "p", "k", "l", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new arhg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (arhg.class) {
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
