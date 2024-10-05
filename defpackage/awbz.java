package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class awbz extends aonm implements aooz {
    public static final awbz a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private apxf e;
    private apkd f;
    private apkd g;
    private awcj h;
    private awct i;
    private aqyg j;
    private aota k;
    private byte l = 2;

    static {
        awbz awbzVar = new awbz();
        a = awbzVar;
        aonm.registerDefaultInstance(awbz.class, awbzVar);
    }

    private awbz() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0004\u0006ᐉ\u0005\tᐉ\u0007\nᐉ\b\fᐉ\u0002\rᐉ\u0003", new Object[]{"c", "d", "e", "h", "i", "j", "k", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new awbz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (awbz.class) {
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
