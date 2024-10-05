package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atcf extends aonm implements aooz {
    public static final atcf a;
    private static volatile aopf q;
    public int b;
    public avgg c;
    public arfs d;
    public atce f;
    public atce g;
    public int h;
    public boolean k;
    public aqyg l;
    public boolean m;
    public apxf n;
    public int o;
    private apxf r;
    private aota s;
    private byte t = 2;
    public aony e = emptyProtobufList();
    public aomf i = aomf.b;
    public aony j = emptyProtobufList();
    public aony p = emptyProtobufList();

    static {
        atcf atcfVar = new atcf();
        a = atcfVar;
        aonm.registerDefaultInstance(atcf.class, atcfVar);
    }

    private atcf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.t);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u0014\u0010\u0000\u0003\n\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ဌ\u0006\bᐉ\b\tည\t\nЛ\u000bဇ\n\rᐉ\u0001\u000eᐉ\u000b\u000fဇ\f\u0010ᐉ\r\u0011င\u000e\u0014\u001b", new Object[]{"b", "c", "e", aqyg.class, "f", "g", "r", "h", atbk.j, "s", "i", "j", apxf.class, "k", "d", "l", "m", "n", "o", "p", apua.class});
            case NEW_MUTABLE_INSTANCE:
                return new atcf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = q;
                if (aopfVar == null) {
                    synchronized (atcf.class) {
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
