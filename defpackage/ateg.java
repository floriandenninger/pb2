package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ateg extends aonm implements aooz {
    public static final ateg a;
    private static volatile aopf m;
    public int b;
    public int c;
    public avgg d;
    public aqyg g;
    public aqyg h;
    public aqyg i;
    public arfs j;
    public apxf k;
    private aulq n;
    private aota o;
    private byte p = 2;
    public aony e = emptyProtobufList();
    public aony f = emptyProtobufList();
    public aomf l = aomf.b;

    static {
        ateg ategVar = new ateg();
        a = ategVar;
        aonm.registerDefaultInstance(ateg.class, ategVar);
    }

    private ateg() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0002\n\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0007\bᐉ\b\tည\t\nЛ\u000bЛ\fᐉ\u0006", new Object[]{"b", "c", atbk.o, "d", "g", "h", "i", "j", "k", "o", "l", "e", avfv.class, "f", apjt.class, "n"});
            case NEW_MUTABLE_INSTANCE:
                return new ateg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (ateg.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
