package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awcw extends aonm implements aooz {
    public static final awcw a;
    private static volatile aopf o;
    public int b;
    public Object d;
    public aqyg e;
    public apxf f;
    public aqyg g;
    public awcb i;
    public awcb j;
    public aulq k;
    public aulq l;
    public int m;
    private aota p;
    public int c = 0;
    private byte q = 2;
    public aony h = emptyProtobufList();
    public aomf n = aomf.b;

    static {
        awcw awcwVar = new awcw();
        a = awcwVar;
        aonm.registerDefaultInstance(awcw.class, awcwVar);
    }

    private awcw() {
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
                return newMessageInfo(a, "\u0001\u000f\u0001\u0001\u0001\u000f\u000f\u0000\u0001\u000b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005ᐼ\u0000\u0006ဉ\u0007\u0007ᐉ\f\bည\r\tᐼ\u0000\nᐼ\u0000\u000bᐉ\t\fᐉ\n\rဉ\b\u000eᐼ\u0000\u000fဌ\u000b", new Object[]{"d", "c", "b", "e", "f", "g", "h", awci.class, avgg.class, "i", "p", "n", aqyg.class, apmh.class, "k", "l", "j", aulq.class, "m", avya.s});
            case NEW_MUTABLE_INSTANCE:
                return new awcw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (awcw.class) {
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
