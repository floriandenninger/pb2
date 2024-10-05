package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arnd extends aonh implements aoni {
    public static final arnd a;
    private static volatile aopf i;
    public int b;
    public int e;
    public arbv f;
    public aqek g;
    public auxw h;
    private byte j = 2;
    public String c = "";
    public aony d = emptyProtobufList();

    static {
        arnd arndVar = new arnd();
        a = arndVar;
        aonm.registerDefaultInstance(arnd.class, arndVar);
    }

    private arnd() {
        emptyProtobufList();
        aonm.emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\u001a\u0006\u0000\u0001\u0001\u0002ဈ\u0001\u0006Л\u0007ဋ\u0003\u0010ဉ\f\u0016ဉ\u0011\u001aဉ\u0014", new Object[]{"b", "c", "d", arne.class, "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new arnd();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (arnd.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
