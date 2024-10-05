package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arcl extends aonm implements aooz {
    public static final arcl a;
    private static volatile aopf n;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg e;
    public aqyg f;
    public aqyg g;
    public aqyg h;
    public apxf i;
    public arcm j;
    public atdf l;
    public aomf m;
    private arar o;
    private aota p;
    private byte q = 2;
    public aony k = emptyProtobufList();

    static {
        arcl arclVar = new arcl();
        a = arclVar;
        aonm.registerDefaultInstance(arcl.class, arclVar);
    }

    private arcl() {
        emptyProtobufList();
        emptyProtobufList();
        this.m = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0002\u0015\r\u0000\u0001\f\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0007\tᐉ\u0002\nᐉ\r\u000bᐉ\b\fЛ\u000eည\u000e\u0010ᐉ\t\u0011ᐉ\n\u0014ᐉ\u0005\u0015ᐉ\u0006", new Object[]{"b", "c", "e", "f", "i", "d", "p", "j", "k", apjt.class, "m", "l", "o", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new arcl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (arcl.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
