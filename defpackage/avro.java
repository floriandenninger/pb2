package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avro extends aonm implements aooz {
    public static final avro a;
    private static volatile aopf b;
    private apxf A;
    private aulq B;
    private byte C = 2;
    private int c;
    private int d;
    private aqyg e;
    private apxf f;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private aqyg k;
    private aqyg l;
    private aqyg m;
    private aqyg n;
    private aqyg o;
    private aqyg p;
    private aqyg q;
    private aqyg r;
    private aqyg s;
    private apxf t;
    private avrd u;
    private atdf v;
    private aota w;
    private aulq x;
    private aulq y;
    private aulq z;

    static {
        avro avroVar = new avro();
        a = avroVar;
        aonm.registerDefaultInstance(avro.class, avroVar);
    }

    private avro() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.C);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.C = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0018\u0000\u0002\u0002)\u0018\u0000\u0000\u0018\u0002ᐉ\u0004\u0003ᐉ\u0007\u0004ᐉ\b\u0005ᐉ\t\u0006ᐉ\n\u0007ᐉ\u000b\bᐉ\f\tᐉ\u000e\fᐉ\u001a\rᐉ\u001b\u000eᐉ\r\u0013ᐉ\u001e\u0014ᐉ\u0005\u0016ᐉ\u000f\u0017ᐉ\u0010\u0018ᐉ\u0011\u0019ᐉ\u0012\u001aᐉ\u0015\u001dᐉ\u0014#ᐉ $ᐉ!%ᐉ#&ᐉ\")ᐉ$", new Object[]{"c", "d", "e", "g", "h", "i", "j", "k", "l", "n", "u", "v", "m", "w", "f", "o", "p", "q", "r", "t", "s", "x", "y", "A", "z", "B"});
            case NEW_MUTABLE_INSTANCE:
                return new avro();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avro.class) {
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
