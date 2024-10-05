package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asqf extends aonm implements aooz {
    public static final asqf a;
    private static volatile aopf k;
    public int b;
    public avgg c;
    public asqg d;
    public aony e;
    public aony f;
    public asqc g;
    public aulq h;
    public String i;
    public apxf j;
    private aqyg l;
    private byte m = 2;

    static {
        asqf asqfVar = new asqf();
        a = asqfVar;
        aonm.registerDefaultInstance(asqf.class, asqfVar);
    }

    private asqf() {
        emptyProtobufList();
        this.e = emptyProtobufList();
        this.f = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.i = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0002\b\u0001ᐉ\u0000\u0003ᐉ\u0002\u0005ᐉ\u0003\u0006Л\u0007Л\nᐉ\u0001\fᐉ\u0005\rဈ\u0006\u000eᐉ\u0007", new Object[]{"b", "l", "d", "g", "e", asqe.class, "f", asqd.class, "c", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new asqf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (asqf.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
