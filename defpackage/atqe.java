package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atqe extends aonm implements aooz {
    public static final atqe a;
    private static volatile aopf n;
    public int b;
    public Object d;
    public avgg e;
    public avgm f;
    public avgg g;
    public aqyg h;
    public aqyg i;
    public apmh j;
    public apmh k;
    private aota o;
    public int c = 0;
    private byte p = 2;
    public aony l = emptyProtobufList();
    public aomf m = aomf.b;

    static {
        atqe atqeVar = new atqe();
        a = atqeVar;
        aonm.registerDefaultInstance(atqe.class, atqeVar);
    }

    private atqe() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0001\u0001\u0001\u000e\f\u0000\u0001\u000b\u0001ᐉ\u0000\u0002ᐉ\u0003\u0003ᐼ\u0000\u0004ᐉ\u0007\u0005ᐉ\b\bᐉ\t\tည\n\nᐉ\u0002\u000bЛ\fᐉ\u0001\rᐼ\u0000\u000eᐉ\u0004", new Object[]{"d", "c", "b", "e", "h", aqyg.class, "j", "k", "o", "m", "g", "l", atrw.class, "f", aulq.class, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new atqe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (atqe.class) {
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
