package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class athb extends aonm implements aooz {
    public static final athb a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private apmh g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private aqyg k;
    private aqyg l;
    private aqyg m;
    private aqyg n;
    private apxf o;
    private apkd p;
    private apkd q;
    private apkd r;
    private apbz s;
    private askm t;
    private atdf u;
    private aota v;
    private apmh w;
    private byte x = 2;

    static {
        athb athbVar = new athb();
        a = athbVar;
        aonm.registerDefaultInstance(athb.class, athbVar);
    }

    private athb() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.x);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.x = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0003$\u0014\u0000\u0000\u0014\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0006\u0007ᐉ\t\bᐉ\n\tᐉ\f\nᐉ\r\u000bᐉ\u000f\u000eᐉ\u0013\u0010ᐉ\u0017\u0012ᐉ\u000b\u0013ᐉ\u0014\u0015ᐉ\u000e\u0016ᐉ\u0015\u0018ᐉ\u0010\u0019ᐉ\u0011\u001aᐉ\u0012\u001cᐉ\u0003!ᐉ\u0005$ᐉ\u001b", new Object[]{"c", "d", "f", "h", "i", "j", "l", "m", "o", "s", "v", "k", "t", "n", "u", "p", "q", "r", "e", "g", "w"});
            case NEW_MUTABLE_INSTANCE:
                return new athb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (athb.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
