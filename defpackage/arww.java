package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arww extends aonm implements aooz {
    public static final arww a;
    private static volatile aopf i;
    public int b;
    public arnb c;
    public long e;
    public long f;
    public int g;
    public float h;
    private byte j = 2;
    public aony d = emptyProtobufList();

    static {
        arww arwwVar = new arww();
        a = arwwVar;
        aonm.registerDefaultInstance(arww.class, arwwVar);
    }

    private arww() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0003ဃ\u0001\u0004ဃ\u0002\u0005ဋ\u0003\u0006ခ\u0004", new Object[]{"b", "c", "d", arwu.class, "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new arww();
            case NEW_BUILDER:
                return new aone((char[]) null, (short[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (arww.class) {
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
