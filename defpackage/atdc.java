package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atdc extends aonm implements aooz {
    public static final atdc a;
    private static volatile aopf l;
    public int b;
    public atdi d;
    public atcv e;
    public boolean f;
    public String g;
    public atcy h;
    public aott i;
    public boolean j;
    public boolean k;
    private aota m;
    private apxf n;
    private aulq o;
    private byte p = 2;
    public aony c = emptyProtobufList();

    static {
        atdc atdcVar = new atdc();
        a = atdcVar;
        aonm.registerDefaultInstance(atdc.class, atdcVar);
    }

    private atdc() {
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
        this.g = "";
    }

    public final void a() {
        aony aonyVar = this.c;
        if (aonyVar.c()) {
            return;
        }
        this.c = aonm.mutableCopy(aonyVar);
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u0012\f\u0000\u0001\u0007\u0001Л\u0003ᐉ\u0000\u0005ᐉ\u0002\u0007ᐉ\u0003\bဇ\u0004\tᐉ\u0007\nဉ\b\u000bဈ\u0006\u000eဇ\u000b\u000fᐉ\n\u0011ᐉ\u000e\u0012ဇ\r", new Object[]{"b", "c", atda.class, "m", "d", "e", "f", "h", "i", "g", "j", "n", "o", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new atdc();
            case NEW_BUILDER:
                return new aone((boolean[][][]) null, (char[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (atdc.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
