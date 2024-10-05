package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apql extends aonm implements aooz {
    public static final apql a;
    private static volatile aopf p;
    public int b;
    public Object d;
    public aqyg f;
    public avgg g;
    public apxf h;
    public apqk j;
    public apqj k;
    public long o;
    private aota q;
    public int c = 0;
    private byte r = 2;
    public String e = "";
    public aomf i = aomf.b;
    public aony l = emptyProtobufList();
    public aony m = emptyProtobufList();
    public aony n = emptyProtobufList();

    static {
        apql apqlVar = new apql();
        a = apqlVar;
        aonm.registerDefaultInstance(apql.class, apqlVar);
    }

    private apql() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0003\t\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐼ\u0000\u0005ᐼ\u0000\u0006ᐉ\u0006\u0007ည\u0007\bဉ\b\tЛ\nЛ\u000bЛ\fဈ\u0000\rဂ\n\u000eဉ\t", new Object[]{"d", "c", "b", "f", "g", "h", aqyg.class, aqyg.class, "q", "i", "j", "l", apqp.class, "m", apqi.class, "n", apqo.class, "e", "o", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new apql();
            case NEW_BUILDER:
                return new aone((boolean[]) null, (boolean[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (apql.class) {
                        aopfVar = p;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            p = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
