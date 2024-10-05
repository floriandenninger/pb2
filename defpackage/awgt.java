package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awgt extends aonm implements aooz {
    public static final awgt a;
    private static volatile aopf k;
    public int b;
    public aqyg c;
    public awgu d;
    public aqyg e;
    public awgs f;
    public aony g;
    public aqyg h;
    public aony i;
    public aomf j;
    private apxf l;
    private aota m;
    private byte n = 2;

    static {
        awgt awgtVar = new awgt();
        a = awgtVar;
        aonm.registerDefaultInstance(awgt.class, awgtVar);
    }

    private awgt() {
        emptyProtobufList();
        this.g = emptyProtobufList();
        this.i = emptyProtobufList();
        this.j = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0002\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0006ᐉ\u0002\u0007ᐉ\u0003\bᐉ\u0004\tᐉ\u0006\nည\u0007\u000bЛ\fЛ\rᐉ\u0005", new Object[]{"b", "c", "d", "l", "e", "f", "m", "j", "g", aqyg.class, "i", aqyg.class, "h"});
            case NEW_MUTABLE_INSTANCE:
                return new awgt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (awgt.class) {
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
