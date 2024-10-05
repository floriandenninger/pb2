package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arcp extends aonm implements aooz {
    public static final arcp a;
    private static volatile aopf m;
    public int b;
    public auda c;
    public aqyg e;
    public int f;
    public aqyg g;
    public aqyg h;
    public aqyg i;
    public apxf j;
    public atdf k;
    public aomf l;
    private apmh n;
    private aota o;
    private byte p = 2;
    public aony d = emptyProtobufList();

    static {
        arcp arcpVar = new arcp();
        a = arcpVar;
        aonm.registerDefaultInstance(arcp.class, arcpVar);
    }

    private arcp() {
        emptyProtobufList();
        emptyProtobufList();
        this.l = aomf.b;
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0002\r\f\u0000\u0001\n\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tЛ\nᐉ\n\u000bည\u000b\fင\u0003\rᐉ\t", new Object[]{"b", "c", "e", "g", "h", "i", "j", "k", "d", avfv.class, "o", "l", "f", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new arcp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (arcp.class) {
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
